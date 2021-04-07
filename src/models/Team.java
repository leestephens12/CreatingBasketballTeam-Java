package models;

import java.awt.*;
import java.util.ArrayList;

public class Team {
    ArrayList<Player> players;
    ArrayList<Coach> coaches;
    private String teamName;
    private String teamLocation;
    private Image teamLogo;


    public Team(String teamName, String teamLocation, Image teamLogo) {
        players = new ArrayList<Player>();
        coaches = new ArrayList<Coach>();
        setTeamName(teamName.trim());
        setTeamLocation(teamLocation.trim());
        setTeamLogo(teamLogo);
    }


    public void addPlayer(Player player) {
        players.add(player);
    }

    public void addCoach(Coach coach) {
        coaches.add(coach);
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        teamName = teamName.trim();
        if(teamName.isEmpty()) {
            throw new IllegalArgumentException("Team name cannot be empty");
        }
        else {
            if(teamName.length() > 2 && teamName.length() < 30) {
                this.teamName = teamName;
            }
            else {
                throw new IllegalArgumentException("Team name should be within the range of 2 to 30 characters");
            }
        }
    }

    public String getTeamLocation() {
        return teamLocation;
    }

    public void setTeamLocation(String teamLocation) {
        teamLocation = teamLocation.trim();
        if(teamLocation.isEmpty()) {
            throw new IllegalArgumentException("Team name cannot be empty");
        }
        else {
            if(teamLocation.length() > 2 && teamLocation.length() < 30) {
                this.teamLocation = teamLocation;
            }
            else {
                throw new IllegalArgumentException("Team location should be within the range of 2 to 30 characters");
            }
        }
    }

    public Image getTeamLogo() {
        return teamLogo;
    }

    public void setTeamLogo(Image teamLogo) {
        this.teamLogo = teamLogo;
    }

    public String getPlayerNames() {
        String playerNames = "";

        for(int i = 0; i < players.size(); i++) {
            playerNames += players.get(i).getFirstName();
        }
        playerNames = playerNames.substring(0, playerNames.length() - 1);
        return playerNames;
    }

    public String toString() {
        return "Team Name: " + teamName + "\nTeam Location: " + teamLocation;
    }
}
