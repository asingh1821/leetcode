package Example.ds;

import java.util.Arrays;

public class ArraySearch {
    public static void main(String[] args) {
        int[] arr = {10,8,30,4,5};
        int x = 5;
        int result = search(arr,x);
        System.out.println(result);
    }
    static int search(int arr[], int x) {
        Arrays.sort(arr);
        int n = arr.length;
        int l = 0, r = n-1;
        while( r >= l){
            int mid = l+(r-l)/2;
            if(arr[mid] == x){
                return mid;
            }else if(arr[mid] > x){
                r = mid;
            }else{
                l = mid+1;
            }
        }
        return -1;
    }
}
