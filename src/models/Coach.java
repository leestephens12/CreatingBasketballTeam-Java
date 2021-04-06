package models;

import java.util.Arrays;
import java.util.List;

public class Coach {
    private String firstName;
    private String lastName;
    private int yearsExperience;
    private String coachingPosition;

    public Coach(String firstName, String lastName, String coachingPosition, int yearsExperience) {
        setFirstName(firstName.trim());
        setLastName(lastName.trim());
        setCoachingPosition(coachingPosition.trim());
        setYearsExperience(yearsExperience);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        firstName = firstName.trim();
        if (firstName.isEmpty()) {
            throw new IllegalArgumentException("You must input a name to continue");
        } else {
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

    public int getYearsExperience() {
        return yearsExperience;
    }

    public void setYearsExperience(int yearsExperience) {
        if(yearsExperience > 0 && yearsExperience < 50) {
            this.yearsExperience = yearsExperience;
        }
        else {
            throw new IllegalArgumentException("Coaches must have 0 to 50 years of experience");
        }
    }

    public String getCoachingPosition() {
        return coachingPosition;
    }

    public void setCoachingPosition(String coachingPosition) {
        if(getValidCoachingPositions().contains(coachingPosition.toLowerCase())) {
            this.coachingPosition = coachingPosition;
        }
        else {
            throw new IllegalArgumentException("Your coaching position must be one of the following: " + getValidCoachingPositions() + ".");
        }
    }

    public static List<String> getValidCoachingPositions() {
        return Arrays.asList("head coach", "assistant coach", "trainer");
    }

    public String toString() {
        return firstName + " " + lastName + "\nCoaching Position: " + coachingPosition;
    }
}
