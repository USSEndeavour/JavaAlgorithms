// 7. Find a number consisting of only different digits. If there are several such numbers, find the first one.

public class Main7 {
    static boolean flag = false;
    static int index;
    static String number;
    
    static String findDifferentDigitsNum(String[] array) {
        for (int i=0; i<array.length; i++) {
            index = 0;

            while (index < array[i].length()) {
                for (int j=index + 1; j<array[i].length(); j++) {
                    if (Character.getNumericValue(array[i].charAt(index)) == Character.getNumericValue(array[i].charAt(j))) {
                        flag = false;
                        break;
                    } else
                        flag = true;
                }
                if (flag == false)
                    break;
                else
                    index++;
            }
            if (flag == true) {
                number = array[i];
                break;
            }
        }
        return number;
    }

    public static void main(String[] args) {
        String num = findDifferentDigitsNum(args);
        System.out.println("The number with all unique digits is: " + num);
    }
}