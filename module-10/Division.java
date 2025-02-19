// Abstract Division class
public abstract class Division {
    protected String divisionName;
    protected int accountNumber;

    // Constructor for Division
    public Division(String divisionName, int accountNumber) {
        this.divisionName = divisionName;
        this.accountNumber = accountNumber;
    }

    // Abstract method to display division details
    public abstract void display();
}