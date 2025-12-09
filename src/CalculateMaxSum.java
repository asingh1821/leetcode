import java.util.concurrent.Executor;

public class CalculateMaxSum {

    public static int maxSum(int[] arr){
        int result = arr[0];
        int maxEnding = arr[0];
        for(int i=1;i<arr.length; i++) {
            maxEnding = Math.max(maxEnding + arr[i],arr[i]);
            result = Math.max(result,maxEnding);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {2,3,-8};
        int res = maxSum(arr);
        System.out.println(res);
    }


}