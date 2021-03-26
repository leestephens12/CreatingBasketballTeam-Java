package models;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Player {

    private String firstName;
    private String lastName;
    private int height;
    private int weight;
    private String position;

    /**
     *
     * @param firstName
     * @param lastName
     * @param height
     * @param weight
     * @param position
     */
    public Player(String firstName, String lastName, int height, int weight, String position){
        setFirstName(firstName.trim());
        setLastName(lastName.trim());
        setHeight(height);
        setWeight(weight);
        setPosition(position.trim());
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        firstName = firstName.trim();
        if(firstName.isEmpty()) {
            throw new IllegalArgumentException("You must input a name to continue");
        }
        else {
            this.firstName = firstName;
        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        lastName = lastName.trim();
        if(lastName.isEmpty()) {
            throw new IllegalArgumentException("You must input a name to continue");
        }
        else {
            this.lastName = lastName;
        }
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if (height > 0 && height <= 250) {
            this.height = height;
        }
        else {
            throw new IllegalArgumentException("The max height you can input for a player is 250cm");
        }
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if(weight > 0 && weight < 300) {
            this.weight = weight;
        }
        else {
            throw new IllegalArgumentException("Your player must be smaller than 300lbs");
        }
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        position = position.toLowerCase();
        if(getValidPositions().contains(position)) {
            this.position = position;
        }
        else {
            throw new IllegalArgumentException("Your position must be one of the following " + getValidPositions() + ".");
        }
    }

    public static List<String> getValidPositions() {
        return Arrays.asList("point guard", "shooting guard", "small forward", "power forward", "centre", "pg", "sg", "sf", "pf", "c");
    }
}