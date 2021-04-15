package controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import models.Coach;
import models.Player;
import utilities.DButility;

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
        lstViewPlayers.getItems().addAll(DButility.getPlayersDB());
        lstViewCoaches.getItems().addAll(DButility.getCoachDB());
    }
}

