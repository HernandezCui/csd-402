public class YearlyService {

    // Constants for service charges
    private static final double STANDARD_SERVICE_CHARGE = 100.0;
    private static final double OIL_CHANGE_FEE = 40.0;
    private static final double TIRE_ROTATION_CHARGE = 30.0;

    // Method 1: Standard service charge
    public static double yearlyService() {
        return STANDARD_SERVICE_CHARGE;
    }

    // Method 2: Standard service charge + oil change fee
    public static double yearlyService(double oilChangeFee) {
        return STANDARD_SERVICE_CHARGE + oilChangeFee;
    }

    // Method 3: Standard service charge + oil change fee + tire rotation charge
    public static double yearlyService(double oilChangeFee, double tireRotationCharge) {
        return STANDARD_SERVICE_CHARGE + oilChangeFee + tireRotationCharge;
    }

    // Method 4: Standard service charge + oil change fee + tire rotation charge - coupon amount
    public static double yearlyService(double oilChangeFee, double tireRotationCharge, double couponAmount) {
        return STANDARD_SERVICE_CHARGE + oilChangeFee + tireRotationCharge - couponAmount;
    }

    // Main method to test each overloaded method
    public static void main(String[] args) {
        System.out.println("Testing yearlyService with no parameters:");
        System.out.println("Visit 1: $" + yearlyService());
        System.out.println("Visit 2: $" + yearlyService());

        System.out.println("\nTesting yearlyService with one parameter:");
        System.out.println("Visit 1: $" + yearlyService(OIL_CHANGE_FEE));
        System.out.println("Visit 2: $" + yearlyService(OIL_CHANGE_FEE));

        System.out.println("\nTesting yearlyService with two parameters:");
        System.out.println("Visit 1: $" + yearlyService(OIL_CHANGE_FEE, TIRE_ROTATION_CHARGE));
        System.out.println("Visit 2: $" + yearlyService(OIL_CHANGE_FEE, TIRE_ROTATION_CHARGE));

        System.out.println("\nTesting yearlyService with three parameters:");
        System.out.println("Visit 1: $" + yearlyService(OIL_CHANGE_FEE, TIRE_ROTATION_CHARGE, 20.0));
        System.out.println("Visit 2: $" + yearlyService(OIL_CHANGE_FEE, TIRE_ROTATION_CHARGE, 10.0));
    }
}