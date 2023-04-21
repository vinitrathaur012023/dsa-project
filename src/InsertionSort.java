
import java.util.Arrays;

public class InsertionSort {
    public static void insertionSort(int[] inputArray){
        for (int i = 1; i <inputArray.length ; i++) {
            int curr=inputArray[i];
            int j = i-1;
            while(j>=0 && curr<inputArray[j]){
                inputArray[j+1] =inputArray[j];
                j--;
            }


           inputArray[j+1]= curr;

        }
    }
//    public static void print(int[] arr){
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]+ " ");
//        }
//    }
    public static void main(String[] args) {
        int[] arr={1,2,8,4,5,9};
        insertionSort(arr);
//        print(arr);
        System.out.println(Arrays.toString(arr));

    }
}
