package array_program;

import java.util.Scanner;

public class MaxNumber {
    public static int maxNumber(int[] arr){
        int max=arr[0];
        for (int i = 1; i < arr.length ; i++) {
            if(arr[i]>max)
                max=arr[i];


        }
        return max;

    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size = sc.nextInt();
        int arr[]=new int[size];
        for (int i = 0; i < arr.length ; i++) {
            arr[i]=sc.nextInt();

        }
        System.out.println(maxNumber(arr));
    }
}
