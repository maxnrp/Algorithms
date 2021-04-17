import java.util.Arrays;

public class Main {

    private static int[] array = {23, 34, 45, 34235, 234, 45, 6465, 234, 5465, 5656, 3, 43, 2, 1};
    private static int numberToInsert = 5;
    private static int numberToSearch = 5656;

    public static void main(String[] args){

        /** Exercises for beginners **/

        System.out.println("Unordered array: \n" + Arrays.toString(array) + "\n");

        /** Sort Algorithms without the use of lambda expressions or collections **/

        System.out.println(SortAlgorithms.selectionSort(array));

        SortAlgorithms.insertionSort(array, numberToInsert);

        /** Search Algorithms without the use of lambda expressions, collections and maps **/

        SearchAlgorithms.linearSearch(array, numberToSearch);

        SearchAlgorithms.binarySearch(array, numberToSearch);

    }
}
