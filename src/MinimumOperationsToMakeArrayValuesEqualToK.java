import java.util.HashSet;

public class MinimumOperationsToMakeArrayValuesEqualToK {
    public static void main(String[] args) {
        int[] nums = {9,7,5,3};
        int k  = 1;
        int res = minOperations(nums, k);
        System.out.println("minimum no. of operations are : "+ res);
    }
    public static int minOperations(int[] nums, int k) {
        HashSet<Integer> hs = new HashSet<>();
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] < k){
                return -1;
            }else if(nums[i] > k){
                hs.add(nums[i]);
            }
        }
        return hs.size();
    }
}
