package models;

import java.util.Arrays;
import java.util.List;

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
        if(firstName.isEmpty() || firstName == null || firstName == "") {
            throw new IllegalArgumentException("You must input a name to continue");
        }
        else {
            if(firstName.length() > 1 && firstName.length() < 30) {
                this.firstName = firstName;
            }
            else {
                throw new IllegalArgumentException("First name should be within the range of 2 to 30 characters");
            }
        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        lastName = lastName.trim();
        if(lastName.isEmpty() || lastName == null || lastName == "") {
            throw new IllegalArgumentException("You must input a name to continue");
        }
        else {
            if(lastName.length() > 1 && lastName.length() < 30) {
                this.lastName = lastName;
            }
            else {
                throw new IllegalArgumentException("Last Name should be within the range of 2 to 30 characters");
            }
        }
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if (height > 25 && height <= 300) {
            this.height = height;
        }
        else {
            throw new IllegalArgumentException("Height Must be between 25-300cm");
        }
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if(weight > 25 && weight < 400) {
            this.weight = weight;
        }
        else {
            throw new IllegalArgumentException("weight must be between 25-400lbs");
        }
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        position = position.toUpperCase();
        if(position.isEmpty()) {
            throw new IllegalArgumentException("Positions cannot be empty");
        }
        else {
            if (getValidPositions().contains(position)) {
                this.position = position;
            } else {
                throw new IllegalArgumentException("Your position must be one of the following " + getValidPositions() + ".");
            }
        }
    }

    /**
     *
     * @return list of valid positions for players
     */
    public static List<String> getValidPositions() {
        return Arrays.asList("PG", "SG", "SF", "PF", "C");
    }

    public String toString() {
        return firstName + " " + lastName + "\nHeight: " + height + " cm \nWeight: " + weight + " lbs \nPosition: " + position;
    }
}
