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
            if(firstName.length() > 2 && firstName.length() < 30) {
                this.firstName = firstName;
            }
            else {
                throw new IllegalArgumentException("Team location should be within the range of 2 to 30 characters");
            }
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
            if(lastName.length() > 2 && lastName.length() < 30) {
                this.lastName = lastName;
            }
            else {
                throw new IllegalArgumentException("Team location should be within the range of 2 to 30 characters");
            }
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
        if(coachingPosition.isEmpty()) {
            throw new IllegalArgumentException("Coaching position cannot be empty");
        }
        else {
            if (getValidCoachingPositions().contains(coachingPosition.toLowerCase())) {
                this.coachingPosition = coachingPosition;
            } else {
                throw new IllegalArgumentException("Your coaching position must be one of the following: " + getValidCoachingPositions() + ".");
            }
        }
    }

    /**
     *
     * @return valid list for coaching positions
     */
    public static List<String> getValidCoachingPositions() {
        return Arrays.asList("head coach", "assistant coach", "trainer");
    }

    public String toString() {
        return firstName + " " + lastName + "\nCoaching Position: " + coachingPosition;
    }
}
