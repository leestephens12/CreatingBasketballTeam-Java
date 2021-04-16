package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import models.Coach;
import models.Team;
import utilities.SceneChanger;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class addCoachController implements Initializable {

    @FXML
    private TextField txtFirstName;

    @FXML
    private TextField txtLastName;

    @FXML
    private ComboBox<String> cmbPosition;

    @FXML
    private Label lblError;

    @FXML
    private TextField txtExperience;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        cmbPosition.getItems().addAll(Coach.getValidCoachingPositions());
        cmbPosition.setValue("head coach");
        lblError.setText("");
    }

    @FXML
    private void addNewCoach(ActionEvent event) {
        try {
            Coach newCoach = new Coach(txtFirstName.getText(), txtLastName.getText(), cmbPosition.getValue(), Integer.parseInt(txtExperience.getText()));
            Team.coaches.add(newCoach);

            SceneChanger.changeScenes(event, "../views/teamRosterView.fxml", "Team Roster");
        }
        catch(IllegalArgumentException | IOException e) {
            lblError.setText(e.getMessage());
        }
    }

    @FXML
    private void clearInformation(ActionEvent event) {
        txtFirstName.setText("");
        txtLastName.setText("");
        txtExperience.setText("");
        cmbPosition.setValue("head coach");
        lblError.setText("");
    }

    @FXML
    private void backBtn(ActionEvent event) throws IOException {
        SceneChanger.changeScenes(event, "../views/teamRosterView.fxml", "Team Roster");
    }
}