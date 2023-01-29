import java.util.Arrays;

// 2. Вывести числа в порядке возрастания значений их длины.

class Main2 {
    static String[] arr;
    static String[] arr1;
    static String[][] arr2;
    static String shortest;

    // sort the array in ascending order
    static String[] sortNums(String[] array) {

        arr = array; // input array
        arr1 = new String[arr.length]; // array for the output
        arr2 = new String[arr.length][]; // create a matrice: each next row contains all but the shortest value of the previous line
        arr2[0] = array; // array to start with

        for (int i=0; i<arr2.length; i++) { // iterate over each row
            shortest = arr2[i][0]; // initial value for each row
            for (int j=0; j<arr2[i].length; j++) { // find the shortest number in the row
                if ((arr2[i][j]).length() < shortest.length())
                    shortest = arr2[i][j];
            }

            if (i != arr2.length-1) { // prevent the ArrayIndexOutOfBound exception
                arr2[i+1] = new String[arr2[i].length - 1];
                for (int k=0, l=0; k<arr2[i].length; k++) {
                    if (arr2[i][k] != shortest) {
                        arr2[i+1][l] = arr2[i][k];
                        l++;
                    }
                }
            }

            arr1[i] = shortest; // add the shortest value of each row to the arr1 array
        }
        return arr1;
    }

    public static void main(String[] args) {
        String[] sorted = sortNums(args);
        System.out.println(Arrays.toString(sorted));
    }
}