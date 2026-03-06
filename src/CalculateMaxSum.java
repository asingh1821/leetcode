import java.util.concurrent.Executor;

public class CalculateMaxSum {

    public static int maxSum(int[] arr){
        int  sum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<arr.length; i++) {
            sum += arr[i];
            maxSum = Math.max(sum,maxSum);
            if(sum < 0){
                sum = 0;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {-3,-1,-2};
        int res = maxSum(arr);
        System.out.println(res);
    }


}