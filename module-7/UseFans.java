import java.util.ArrayList;
import java.util.List;

public class UseFans {

    public static class Fan {

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

        // Method to display fan details without using toString()
        public void displayFanDetails() {
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
            // Print fan details without using toString()
            System.out.println("Fan [speed=" + speedString + ", on=" + status + ", radius=" + radius + ", color=" + color + "]");
        }

        // Overriding toString() (just for reference)
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
    }

    // Method to display details of all fans in the collection
    public void displayAllFans(List<Fan> fans) {
        for (Fan fan : fans) {
            fan.displayFanDetails();  // Calls displayFanDetails() on each fan
            System.out.println("--------------------");
        }
    }

    // Method to display details of a single fan
    public void displaySingleFan(Fan fan) {
        fan.displayFanDetails();  // Calls displayFanDetails() on the given fan
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        // Create an array list to store fans
        List<Fan> fanCollection = new ArrayList<>();

        // Create Fan instances and add them to the collection
        fanCollection.add(new Fan(Fan.FAST, true, 10.0, "blue"));
        fanCollection.add(new Fan(Fan.MEDIUM, false, 8.0, "green"));
        fanCollection.add(new Fan(Fan.SLOW, true, 6.5, "red"));

        // Create an instance of UseFans to manage the fan collection
        UseFans useFans = new UseFans();

        // Display all fans in the collection
        System.out.println("Displaying all fans in the collection:");
        useFans.displayAllFans(fanCollection);

        // Display a single fan from the collection
        System.out.println("Displaying details of a single fan:");
        useFans.displaySingleFan(fanCollection.get(0));  // Display the first fan

        // Display the fans using toString (for comparison)
        System.out.println("\nDisplaying fans using toString (for comparison):");
        for (Fan fan : fanCollection) {
            System.out.println(fan.toString());
        }
    }
}