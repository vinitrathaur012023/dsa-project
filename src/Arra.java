import java.util.Scanner;

public class Arra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }
        int index = sc.nextInt();
        for (int j = 0; j < arr.length; j++) {
            if (index == j)
                System.out.print(arr[j]);
        }
    }
}