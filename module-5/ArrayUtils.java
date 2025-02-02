public class ArrayUtils {

    public static int[] locateLargest(double[][] arrayParam) {
        int[] location = new int[2];
        double largest = arrayParam[0][0];
        location[0] = 0;
        location[1] = 0;

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > largest) {
                    largest = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    public static int[] locateLargest(int[][] arrayParam) {
        int[] location = new int[2];
        int largest = arrayParam[0][0];
        location[0] = 0;
        location[1] = 0;

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > largest) {
                    largest = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }
    public static int[] locateSmallest(double[][] arrayParam) {
        int[] location = new int[2];
        double smallest = arrayParam[0][0];
        location[0] = 0;
        location[1] = 0;

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < smallest) {
                    smallest = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    public static int[] locateSmallest(int[][] arrayParam) {
        int[] location = new int[2];
        int smallest = arrayParam[0][0];
        location[0] = 0;
        location[1] = 0;

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < smallest) {
                    smallest = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    // Main method to test the functionality of the above methods
    public static void main(String[] args) {
        double[][] doubleArray = {
            {1.2, 4.5, 7.8},
            {9.1, 2.3, 6.4},
            {3.7, 8.2, 5.6}
        };

        int[][] intArray = {
            {12, 45, 78},
            {91, 23, 64},
            {37, 82, 56}
        };

        // Testing the locateLargest and locateSmallest methods for both double and int arrays
        int[] largestDouble = locateLargest(doubleArray);
        int[] smallestDouble = locateSmallest(doubleArray);
        int[] largestInt = locateLargest(intArray);
        int[] smallestInt = locateSmallest(intArray);

        System.out.println("Largest element in double array at: [" + largestDouble[0] + "," + largestDouble[1] + "]");
        System.out.println("Smallest element in double array at: [" + smallestDouble[0] + "," + smallestDouble[1] + "]");
        System.out.println("Largest element in int array at: [" + largestInt[0] + "," + largestInt[1] + "]");
        System.out.println("Smallest element in int array at: [" + smallestInt[0] + "," + smallestInt[1] + "]");
    }
}
