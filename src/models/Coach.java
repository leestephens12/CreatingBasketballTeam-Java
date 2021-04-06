package models;

public class Coach {
    private String firstName;
    private String lastName;
    private int yearsExperience;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getYearsExperience() {
        return yearsExperience;
    }

    public void setYearsExperience(int yearsExperience) {
        this.yearsExperience = yearsExperience;
    }

    public int getCoachingPosition() {
        return coachingPosition;
    }

    public void setCoachingPosition(int coachingPosition) {
        this.coachingPosition = coachingPosition;
    }

    private int coachingPosition;
}
