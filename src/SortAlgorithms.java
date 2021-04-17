import java.util.Arrays;

public class SortAlgorithms {

    public static String selectionSort(int[] arr){

        for (int i = 0; i < arr.length - 1; i++) {
            int currentIndex = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[currentIndex]) {
                    currentIndex = j;
                }
            }
            int savedNumber = arr[currentIndex];
            arr[currentIndex] = arr[i];
            arr[i] = savedNumber;
        }

        return Arrays.toString(arr);
    }



    public static int[] insertionSort(int[] arr, int numberToInsert){
        return arr;
    }

}














