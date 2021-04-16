package models;

import java.util.Arrays;
import java.util.List;

public class Coach {
    private String firstName;
    private String lastName;
    private int yearsExperience;
    private String coachingPosition;

    /**]
     * @param firstName
     * @param lastName
     * @param coachingPosition
     * @param yearsExperience
     */
    public Coach(String firstName, String lastName, String coachingPosition, int yearsExperience) {
        setFirstName(firstName.trim());
        setLastName(lastName.trim());
        setCoachingPosition(coachingPosition.trim());
        setYearsExperience(yearsExperience);
    }

    //get the value of the first name for Coach
    public String getFirstName() {
        return firstName;
    }

    //setting the name for the coach
    public void setFirstName(String firstName) {
        firstName = firstName.trim();
        //if the text box is left blank it will throw an exception
        if (firstName.isEmpty()) {
            throw new IllegalArgumentException("You must input a name to continue");
        } else { //if its not blank it will check to make sure the first name is between 1 - 50 digits
            if(firstName.length() > 2 && firstName.length() < 30) {
                this.firstName = firstName;
            }
            else {
                throw new IllegalArgumentException("Team location should be within the range of 2 to 30 characters");
            }
        }
    }

    //gets value of last name for the coach
    public String getLastName() {
        return lastName;
    }

    //Set the value for the last name
    public void setLastName(String lastName) {
        lastName = lastName.trim();
        //if the string is left empty it will throw an exception
        if(lastName.isEmpty()) {
            throw new IllegalArgumentException("You must input a name to continue");
        }
        else { // if its not empty it will check to see that it is in between 2-50 digits
            if(lastName.length() > 2 && lastName.length() < 30) {
                this.lastName = lastName;
            }
            else {
                throw new IllegalArgumentException("Team location should be within the range of 2 to 30 characters");
            }
        }
    }

    //gets the value for the years of experience for the coach
    public int getYearsExperience() {
        return yearsExperience;
    }

    //sets the value for years of experience for the coach
    public void setYearsExperience(int yearsExperience) {
        //if it's not in between 0 and 50 it will throw an exception
        if(yearsExperience > 0 && yearsExperience < 50) {
            this.yearsExperience = yearsExperience;
        }
        else {
            throw new IllegalArgumentException("Coaches must have 1 to 50 years of experience");
        }
    }

    //gets the value for the coaching position
    public String getCoachingPosition() {
        return coachingPosition;
    }

    //if the coaching position is left empty it will throw an exception
    public void setCoachingPosition(String coachingPosition) {
        if(coachingPosition.isEmpty()) {
            throw new IllegalArgumentException("Coaching position cannot be empty");
        }//it checks to see that it is one of the valid options
        else {
            if (getValidCoachingPositions().contains(coachingPosition.toLowerCase())) {
                this.coachingPosition = coachingPosition;
            } else {
                throw new IllegalArgumentException("Your coaching position must be one of the following: " + getValidCoachingPositions() + ".");
            }
        }
    }

    /**
     * @return valid list for coaching positions
     */
    public static List<String> getValidCoachingPositions() {
        return Arrays.asList("head coach", "assistant coach", "trainer");
    }

    public String toString() {
        return firstName + " " + lastName + "\nCoaching Position: " + coachingPosition;
    }
}
