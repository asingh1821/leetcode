package Example;

import java.util.HashSet;
import java.util.Set;

public class MaximumSumOfDistinctSubArrayWithLengthK {
    public static void main(String[] args) {
        int[] nums = {1,5,4,2,9,9,9};
        int k = 3;
        long res = maximumSubarraySum(nums, k);
        System.out.print(res);
    }
    public static  long maximumSubarraySum(int[] nums, int k) {
        long result = 0, sum = 0;
        HashSet<Integer> set = new HashSet();
        int length = nums.length;
        int i = 0, j = 0;
        while( j < length){
            if(!set.contains(nums[j])){
                sum += nums[j];
                set.add(nums[j]);
                if(j - i + 1 == k){
                    result = Math.max(result,sum);
                    sum -= nums[i];
                    set.remove(nums[i]);
                    i++;
                }
                j++;
            }else{
                sum -= nums[i];
                set.remove(nums[i]);
                i++;
            }
        }
        return result;
    }
}
