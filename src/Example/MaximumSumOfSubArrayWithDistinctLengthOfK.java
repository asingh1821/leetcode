package Example;

public class MaximumSumOfSubArrayWithDistinctLengthOfK {
    public static void main(String[] args) {
        int[] nums = {4,4,4,4};
        int k = 3;
        long result = maximumSubarraySum(nums,k);
        System.out.print(result);
    }
    public static long maximumSubarraySum(int[] nums, int k) {
        long maxSubArraySum = 0;
        int j = 0;
        for (int i = 0; i <= nums.length - k; i++) {
            long tempSum = 0;
            for ( j = i; j <= k + i - 1; j++) {
                if (nums[j] == nums[j + 1]) {
                    break;
                } else {
                    tempSum = nums[j];
                }

            }
            tempSum += nums[j + 1];
            maxSubArraySum = Math.max(tempSum, maxSubArraySum);
        }
        return maxSubArraySum;
    }
}
