package controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import models.Player;
import models.Team;

import javafx.event.ActionEvent;
import utilities.SceneChanger;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class addPlayerController implements Initializable {

    @FXML
    private TextField txtFirstName;

    @FXML
    private TextField txtLastName;

    @FXML
    private TextField txtHeight;

    @FXML
    private TextField txtWeight;

    @FXML
    private ComboBox<String> cmbPosition;

    @FXML
    private Label lblError;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        cmbPosition.getItems().addAll(Player.getValidPositions());
        cmbPosition.setValue("PG");
        lblError.setText("");
    }

    @FXML
    private void addNewPlayer(ActionEvent event) {
        try {
            Player newPlayer = new Player(txtFirstName.getText(), txtLastName.getText(), Integer.parseInt(txtHeight.getText()), Integer.parseInt(txtWeight.getText()), cmbPosition.getValue());
            Team.players.add(newPlayer);

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
        txtHeight.setText("");
        txtWeight.setText("");
        cmbPosition.setValue("PG");
        lblError.setText("");
    }

    @FXML
    private void backBtn(ActionEvent event) throws IOException {
        SceneChanger.changeScenes(event, "../views/teamRosterView.fxml", "Team Roster");
    }
}