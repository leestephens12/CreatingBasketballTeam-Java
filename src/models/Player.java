package models;

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
        setFirstName(firstName);
        setLastName(lastName);
        setHeight(height);
        setWeight(weight);

        setPosition(position);
    }

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

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
