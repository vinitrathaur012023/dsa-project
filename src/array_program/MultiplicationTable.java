package array_program;

import java.util.Scanner;

public class MultiplicationTable {
    public static void multiplicationOfTable(int num){
        for (int i=1; i<=10; i++) {
            System.out.print(num*i+" ");


        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        multiplicationOfTable(num);
    }
}
