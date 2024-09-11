// GeneralUser.java
public class GeneralUser extends User {
    private int ecoPoints;

    public GeneralUser(String name) {
        super(name, "GeneralUser");
        this.ecoPoints = 0;
    }

    public void requestWasteCollection() {
        System.out.println(name + " has requested waste collection.");
    }

    public void earnEcoPoints(int points) {
        ecoPoints += points;
    }

    public int getEcoPoints() {
        return ecoPoints;
    }

    @Override
    public void displayInfo() {
        System.out.println("User: " + name + " | Role: " + role);
    }
}
