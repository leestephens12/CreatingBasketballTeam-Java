package controllers;

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
import models.Player;
import models.Team;
import utilities.DButility;

import javafx.event.ActionEvent;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class addPlayerController implements Initializable {

    @FXML
    private Label lblAddPlayer;

    @FXML
    private Label lblFirstName;

    @FXML
    private Label lblLastName;

    @FXML
    private Label lblHeight;

    @FXML
    private Label lblWeight;

    @FXML
    private Label lblPosition;

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
        cmbPosition.getItems().addAll("PG", "SG","SF", "PF", "C");
    }

    @FXML
    private void addNewPlayer(ActionEvent event) {
        lblError.setText("");
        try {
            Player newPlayer = new Player(txtFirstName.getText(), txtLastName.getText(), Integer.parseInt(txtHeight.getText()), Integer.parseInt(txtWeight.getText()), cmbPosition.getValue());
            DButility.players.add(newPlayer);

            Parent root = FXMLLoader.load(getClass().getResource("../views/teamRosterView.fxml"));
            Stage primaryStage = (Stage)((Node)event.getSource()).getScene().getWindow();
            primaryStage.setTitle("Team Roster");
            primaryStage.setScene(new Scene(root));
            primaryStage.show();
        }
        catch(IllegalArgumentException | IOException e) {
            lblError.setText(e.getMessage());
        }
    }
}