package Example.ds;

import java.util.ArrayList;
import java.util.List;

public class SlidingWindowFindMaxInTheArray {
    public static void main(String[] args) {
        int[] arr = {4,1,3,5,1,2,3,2,1,1,5};
        int k = 3;
         findMaxInArray(arr,k);
    }
    public static void findMaxInArray(int[] arr, int k){
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i <= arr.length-k; i++){
            int max = arr[i];
            for(int j = i; j <= k-1+i; j++){
                max = Math.max(max,arr[j]);
            }
            list.add(max);
        }
        System.out.print(list+" ");
    }
}
