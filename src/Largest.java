
import java.util.*;
public class Largest {
    public static void main(String[] args) {
        int []arr=new int[] {40,30,50,80};
        int max=arr[0];
        for (int i=0; i<arr.length; i++){
     if(arr[i]>max)
         max=arr[i];
        }
        System.out.println(max);
    }
}
