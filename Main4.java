import java.util.Arrays;

// 4. Найти число, в котором количество различных цифр минимально. Если таких чисел несколько, найти первое из них.

class Main4 {
    static char arr[]; // array to store all digits from a number
    static int index;
    static int counter;
    static char[] array;
    static int min;
    static int minIndex;

    static int getUniqueDigits(String num) { // a method to get unque digits from a number
        arr = new char[num.length()];
        for (int i=0, j=0; i<num.length(); i++) { // store all digits to a new array
            arr[j] = num.charAt(i);
            j++;
        }

        index = 0;
        while (index < arr.length) { // replace repeating digits with an 'n' symbol
            for (int k=index+1; k<arr.length; k++) {
                if (arr[index] == arr[k])
                    arr[k] = 'n';
            }
            index++;
        }

        counter = 0;
        for (int x=0; x<arr.length; x++) { // count the unique digits
            if (arr[x] != 'n')
                counter++;
        }
        return counter;
    }

    static int getMinIndex(int[] arry) { // get the index of a number with the smallest amount of unique digits
        min = arry[0];
        minIndex = 0;
        for (int i=0; i<arry.length; i++) {
            if (arry[i]<min) {
                min = arry[i];
                minIndex = i;
            }
        }
        return minIndex;
    }


    public static void main(String[] args) {
        int array[] = new int[args.length]; // an array to store the amount of unique digits of each number from args

        for (int i=0, j=0; i<args.length; i++) {
            array[j] = getUniqueDigits(args[i]);
            j++;
        }

        System.out.println("Amount of unique digits in each number: " + Arrays.toString(array));
        System.out.println("A number with the smallest amount of different digits: " + args[getMinIndex(array)]);
    }
}