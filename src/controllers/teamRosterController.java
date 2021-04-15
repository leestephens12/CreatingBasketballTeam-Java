package controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.stage.Stage;
import models.Coach;
import models.Player;
import utilities.DButility;

import javafx.event.ActionEvent;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class teamRosterController implements Initializable {

    @FXML
    private Label teamRosterLbl;

    @FXML
    private Label playersLbl;

    @FXML
    private ListView<Player> lstViewPlayers;

    @FXML
    private Label coachingStaffLbl;

    @FXML
    private ListView<Coach> lstViewCoaches;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        lstViewPlayers.getItems().addAll(DButility.players);
        lstViewCoaches.getItems().addAll(DButility.getCoachDB());
    }

    @FXML
    private void addPlayerbtn(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("../views/addPlayer.fxml"));
        Stage primaryStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        primaryStage.setTitle("Add Player");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
}

