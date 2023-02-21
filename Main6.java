// 6. Find a number whose digits are ordered in ascending manner. If there are several such numbers, find the first one.

public class Main6 {
    static boolean flag = true;
    static String ascending;

    static String ascendingNum(String[] arr) {
        for (int i=0; i<arr.length; i++) {
            for (int j=0; j<arr[i].length() - 1; j++) {
                if (Character.getNumericValue(arr[i].charAt(j)) > Character.getNumericValue(arr[i].charAt(j+1))) {
                    flag = false;
                    break;
                }
                else flag = true;
            }
            if (flag) {
                ascending = arr[i];
                break;
            }
        }
        return ascending;
    }

    public static void main(String[] args) {
        String num = ascendingNum(args);
        System.out.println("The ascending number is: " + num);
    }
}