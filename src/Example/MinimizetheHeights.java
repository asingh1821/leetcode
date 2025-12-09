package Example;

import java.util.Arrays;

public class MinimizetheHeights {
    public static void main(String[] args) {
        int[] arr = {1, 8, 10, 6, 4, 6, 9, 1};
        int k = 7;
        int res = getMinDiff(arr,k);
        System.out.println(res);
    }
    public static int getMinDiff ( int[] arr, int k){
        int diff = 0, index = 0;
        for (int i = 0; i < arr.length; i++) {
            diff = arr[i] - k;
            if (diff <= 0) {
                arr[index++] = arr[i] + k;
            } else {
                arr[index++] = arr[i] - k;
            }
        }
        Arrays.sort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println(".........");
        return arr[arr.length - 1] - arr[0];
    }
}
