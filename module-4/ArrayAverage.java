public class ArrayAverage {

    public static short average(short[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }
        
        short sum = 0;
        for (short num : array) {
            sum += num;
        }
        return (short)(sum / array.length); 
    }

    public static int average(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }

        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum / array.length;
    }
    public static long average(long[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }

        long sum = 0;
        for (long num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    public static double average(double[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }

        double sum = 0.0;
        for (double num : array) {
            sum += num;
        }
        return sum / array.length;
    }
    
    public static void main(String[] args) {
        // Test case 1: short array
        short[] shortArray = {1, 2, 3, 4, 5};
        System.out.print("Short array: ");
        for (short num : shortArray) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("Average of short array: " + average(shortArray));

        // Test case 2: int array
        int[] intArray = {10, 20, 30};
        System.out.print("Int array: ");
        for (int num : intArray) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("Average of int array: " + average(intArray));

        // Test case 3: long array
        long[] longArray = {100L, 200L, 300L, 400L};
        System.out.print("Long array: ");
        for (long num : longArray) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("Average of long array: " + average(longArray));

        // Test case 4: double array
        double[] doubleArray = {2.5, 3.5, 4.5, 5.5, 6.5};
        System.out.print("Double array: ");
        for (double num : doubleArray) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("Average of double array: " + average(doubleArray));
    }
}
