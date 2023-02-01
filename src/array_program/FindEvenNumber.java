package array_program;

public class FindEvenNumber {
    public static void findEvenNumberArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            if(array[i]%2!=0)
                System.out.print( array[i] + " ");
        }

    }


    public static void main(String[] args) {
        int arr[] = {5, 6, 7, 8, 9, 10};
        System.out.print("print odd number ->> ");
      findEvenNumberArray(arr);
        System.out.println();
        System.out.print("print even number:");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2== 0) {
                System.out.print(arr[i]+" ");
            }

        }

    }
}
