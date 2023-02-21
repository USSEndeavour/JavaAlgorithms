// 5. Find the amount of numbers containing only even digits, and among the remaining ones, find the amount of numbers
// with an equal number of even and odd digits. Find the first one if there are several.
import java.util.Arrays;

public class Main5 {
    static int[] arr;
    static int localEvenCounter;
    static int localOddCounter;
    static int globalEvenCounter;
    static int globalMixedCounter;
    static int digit;

    static int[] getEv(String[] array) {
        arr = new int[2];
        globalEvenCounter = 0;
        globalMixedCounter = 0;
        for (int i=0; i<array.length; i++) {
            localEvenCounter = 0;
            localOddCounter = 0;
            for (int j=0; j<array[i].length(); j++) {
                if (Character.getNumericValue(array[i].charAt(j)) % 2 == 0 && Character.getNumericValue(array[i].charAt(j)) != 0) {
                    localEvenCounter++;
                } else {
                    localOddCounter++;
                }
            }
            if (localEvenCounter == array[i].length())
                globalEvenCounter++;
            else if (localOddCounter == localEvenCounter)
                globalMixedCounter++;
        }
        arr[0] = globalEvenCounter;
        arr[1] = globalMixedCounter;
        return arr;
    }

    public static void main(String[] args) {
        int[] evMixed = getEv(args);
        System.out.println("The number of numbers with even digits only: " + evMixed[0]);
        System.out.println("The number of numbers with equal number of odd/even: " + evMixed[1]);
    }
}