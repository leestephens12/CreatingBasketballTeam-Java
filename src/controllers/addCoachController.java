package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import models.Coach;
import models.Player;
import utilities.DButility;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class addCoachController implements Initializable {

    @FXML
    private Label lblAddCoach;

    @FXML
    private Label lblFirstName;

    @FXML
    private Label lblLastName;

    @FXML
    private Label lblCoachingPosition;

    @FXML
    private Label lblYearsOfExperience;

    @FXML
    private TextField txtFirstName;

    @FXML
    private TextField txtLastName;

    @FXML
    private ComboBox<String> cmbPosition;

    @FXML
    private TextField txtExperience;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        cmbPosition.getItems().addAll("head coach", "assistant coach", "trainer");
    }

    @FXML
    private void addNewCoach(ActionEvent event) {
        try {
            Coach newCoach = new Coach(txtFirstName.getText(), txtLastName.getText(), cmbPosition.getValue(), Integer.parseInt(txtExperience.getText()));
            DButility.coaches.add(newCoach);

            Parent root = FXMLLoader.load(getClass().getResource("../views/teamRosterView.fxml"));
            Stage primaryStage = (Stage)((Node)event.getSource()).getScene().getWindow();
            primaryStage.setTitle("Team Roster");
            primaryStage.setScene(new Scene(root));
            primaryStage.show();
        }
        catch(IllegalArgumentException | IOException e) {
        }
    }
}