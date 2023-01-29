import java.util.Arrays;

// 1. Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.

class Main1 {
//    static String shortest;
    static String longest;
    static String[] shlong = new String[2];

    static String[] findShortestLongest(String[] arr) {
        String shortest = arr[0];
        for (String x: arr) {
            if (x.length() < shortest.length())
                 shortest = x;
        }

        longest = arr[0];
        for (String y: arr) {
            if (y.length() > longest.length())
                longest = y;
        }

        shlong[0] = shortest;
        shlong[1] = longest;
        return shlong;
    }

    public static void main(String[] args) {
        String[] sl = findShortestLongest(args);
        System.out.println("The shortest and longest numbers are: " + Arrays.toString(sl));
    }
}