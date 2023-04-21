import java.util.Arrays;

public class MergeSort {
    public static void mergeSort(int [] inputArray){
        int len=inputArray.length;
        if( len<2){
            return;
        }
        int mid=len/2;
        int[] left=new int[mid];
        int [] right= new int[len-mid];
        for (int i =0; i <mid ; i++) {
            left[i]= inputArray[i];
        }
        for (int i = mid; i <len ; i++) {
            right[i-mid]=inputArray[i];


        }
        mergeSort(left);
        mergeSort(right);
        merge(inputArray,left,right);
    }
    public static void merge(int[] mainArray,int[] left,int[] right){
        int l=left.length;
        int r= right.length;
        int i=0;
        int j=0;
        int poss=0;
        while(i<l && j<r){
            if(left[i]<right[j]){
                mainArray[poss]=left[i];
                i++;
                poss++;

            } else if (left[i]>right[j]) {
                mainArray[poss]=right[j];
                i++;
                poss++;

            }else {
                mainArray[poss]=left[i];
                i++;
                poss++;
                mainArray[poss]=right[j];
                j++;
                poss++;
            }
        }
        while(i<l){
            mainArray[poss]=left[i];
            i++;
            poss++;

        }
        while(j<r){
            mainArray[poss]=right[j];
            j++;
            poss++;

        }


    }

    public static void main(String[] args) {
        int[]arr={2,3,4,9,7,6,5,8,1};
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
