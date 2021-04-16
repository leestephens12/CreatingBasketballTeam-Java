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
        //Add valid positions to a combo box
        cmbPosition.getItems().addAll(Player.getValidPositions());
        //set default values
        cmbPosition.setValue("PG");
        lblError.setText("");
        txtHeight.setText("0");
        txtWeight.setText("0");
    }

    @FXML
    private void addNewPlayer(ActionEvent event) {
        //use try catch to catch any user errors that may occur
        try {
            //Create a new payer object and add it to the player list
            Player newPlayer = new Player(txtFirstName.getText(), txtLastName.getText(), Integer.parseInt(txtHeight.getText()), Integer.parseInt(txtWeight.getText()), cmbPosition.getValue());
            Team.players.add(newPlayer);

            //bring user back to the roster page
            SceneChanger.changeScenes(event, "../views/teamRosterView.fxml", "Team Roster");
        }//notify user if there are any errors
        catch(IllegalArgumentException | IOException e) {
            lblError.setText(e.getMessage());
        }
    }

    @FXML
    private void clearInformation(ActionEvent event) {
        //set info back to default
        txtFirstName.setText("");
        txtLastName.setText("");
        txtHeight.setText("0");
        txtWeight.setText("0");
        cmbPosition.setValue("PG");
        lblError.setText("");
    }

    @FXML
    private void backBtn(ActionEvent event) throws IOException {
        //bring user back to roster page
        SceneChanger.changeScenes(event, "../views/teamRosterView.fxml", "Team Roster");
    }
}