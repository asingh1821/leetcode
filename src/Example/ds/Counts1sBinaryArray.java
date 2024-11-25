package Example.ds;

import java.util.Arrays;

public class Counts1sBinaryArray {
    public static void main(String[] args) {
        int[] arr = {1,1,1,1,1,0,0,0};
        int N = 1;
        int result = countOnes(arr,N);
        System.out.println(result);
    }
    public static int countOnes(int arr[], int N){
        Arrays.sort(arr);
        int n = arr.length;
        int l = 0, r = n-1, ans = 0, mid = 0;
        while(r >= l){
            mid = l + (r - l) / 2;
            if(arr[mid] == 0){
                l = mid + 1;
            }else if(arr[mid] == 1){
                ans = n - mid;
                r = mid -1;
            }
        }
        return ans;
    }
}
