package models;

import java.awt.*;
import java.util.ArrayList;

public class Team {
    public static ArrayList<Player> players = new ArrayList<>();
    public static ArrayList<Coach> coaches = new ArrayList<>();
    private String teamName;
    private String teamLocation;


    public Team(String teamName, String teamLocation) {
        setTeamName(teamName.trim());
        setTeamLocation(teamLocation.trim());
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
