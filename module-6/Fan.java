// Fan class definition
public class Fan {

    // Constants for speed levels
    public static final int STOPPED = 0;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    // Private fields
    private int speed;  // Speed of the fan (0: STOPPED, 1: SLOW, 2: MEDIUM, 3: FAST)
    private boolean on; // Fan on or off
    private double radius; // Radius of the fan
    private String color; // Color of the fan

    // No-argument constructor setting default values
    public Fan() {
        this.speed = STOPPED;
        this.on = false;
        this.radius = 6.0;
        this.color = "white";
    }

    // Constructor with arguments to set specific values
    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    // Getter and setter methods for all mutable fields

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Method to return a string representation of the fan's state
    @Override
    public String toString() {
        String status = on ? "on" : "off";
        String speedString;
        switch (speed) {
            case SLOW:
                speedString = "SLOW";
                break;
            case MEDIUM:
                speedString = "MEDIUM";
                break;
            case FAST:
                speedString = "FAST";
                break;
            default:
                speedString = "STOPPED";
                break;
        }
        return "Fan [speed=" + speedString + ", on=" + status + ", radius=" + radius + ", color=" + color + "]";
    }

    // Main method to test the Fan class
    public static void main(String[] args) {
        // Creating two Fan objects
        Fan fan1 = new Fan(); // Using default constructor
        Fan fan2 = new Fan(FAST, true, 10.0, "blue"); // Using argument constructor

        // Displaying the initial states of the fans
        System.out.println("Fan 1 (Default Constructor): " + fan1);
        System.out.println("Fan 2 (Argument Constructor): " + fan2);

        // Changing properties of fan1 using setters
        fan1.setSpeed(MEDIUM);
        fan1.setOn(true);
        fan1.setRadius(8.0);
        fan1.setColor("red");

        // Displaying updated state of fan1
        System.out.println("\nUpdated Fan 1: " + fan1);
    }
}
