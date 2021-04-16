package controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import models.Coach;
import models.Player;
import models.Team;

import javafx.event.ActionEvent;
import utilities.SceneChanger;

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

    @FXML
    private TextField txtTeamName;

    @FXML
    private TextField txtTeamLocation;

    @FXML
    private Label lblTeamName;

    @FXML
    private Label lblTeamLocation;

    @FXML
    private Label lblError;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        lstViewPlayers.getItems().addAll(Team.players);
        lstViewCoaches.getItems().addAll(Team.coaches);
    }

    @FXML
    private void addPlayerbtn(ActionEvent event) throws IOException {
        SceneChanger.changeScenes(event, "../views/addPlayer.fxml", "Add Player");
    }

    @FXML
    private void addCoachbtn(ActionEvent event) throws IOException {
        SceneChanger.changeScenes(event, "../views/addCoach.fxml", "Add Coach");
    }
}

