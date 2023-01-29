import java.util.Arrays;

// 3. Вывести на консоль те числа, длина которых меньше средней длины по всем числам, а также длину.

class Main3 {
    
    // calculate the average len of numbers
        static double getAverage(String[] array) {
        double av = 0;
        for (String i: array) av += i.length();
        av /= array.length;
        return av;
    }

    // array contains only those values that are shorter than average
        static String[] filterNums(String[] arr) {

            int len = 0; // length of the filtered array
            for (String x: arr) {
                if (x.length() < getAverage(arr))
                    len += 1;
            }

            String[] filteredArray = new String[len];
            for (int i=0, k=0; i<arr.length; i++) {
                if (arr[i].length() < getAverage(arr)) {
                    filteredArray[k] = arr[i] + ": length = " + String.valueOf(arr[i].length());
                    k++;
                }
            }
        return filteredArray;
    }

    public static void main(String[] args) {
        double average = getAverage(args);
        System.out.println("Average length of number is: " + average);
        String[] ret = filterNums(args);
        System.out.println(Arrays.toString(ret));
    }
}