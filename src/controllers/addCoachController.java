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
        //Puts the valid coaching positions into the combo box
        cmbPosition.getItems().addAll(Coach.getValidCoachingPositions());
        //setting text values to their default
        cmbPosition.setValue("head coach");
        lblError.setText("");
        txtExperience.setText("0");
    }

    @FXML
    private void addNewCoach(ActionEvent event) {
        //using a try catch to catch any of the users errors and make them aware
        try {
            //Creating a new coach object and adding it to the coaches array list
            Coach newCoach = new Coach(txtFirstName.getText(), txtLastName.getText(), cmbPosition.getValue(), Integer.parseInt(txtExperience.getText()));
            Team.coaches.add(newCoach);

            //change scene back to the team roster screen
            SceneChanger.changeScenes(event, "../views/teamRosterView.fxml", "Team Roster");
        }
        //Notify user if there are any errors
        catch(IllegalArgumentException | IOException e) {
            lblError.setText(e.getMessage());
        }
    }

    @FXML
    private void clearInformation(ActionEvent event) {
        //Set all the information back to default
        txtFirstName.setText("");
        txtLastName.setText("");
        txtExperience.setText("0");
        cmbPosition.setValue("head coach");
        lblError.setText("");
    }

    @FXML
    private void backBtn(ActionEvent event) throws IOException {
        //Bring user back to the roster page
        SceneChanger.changeScenes(event, "../views/teamRosterView.fxml", "Team Roster");
    }
}