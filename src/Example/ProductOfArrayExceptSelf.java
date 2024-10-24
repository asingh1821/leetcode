package Example;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
       int[] result =  productExceptSelf(nums);
       for (int i=0; i<result.length; i++){
           System.out.print(result[i]+" ");
       }
    }
    public static int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] leftArray = new int[len];
        int[] rightArray = new int[len];
        int[] last = new int[len];
        int leftMult = 1, rightMult = 1, mult = 1;
        leftArray[0] =  1;
        for(int i=1; i<len; i++){
            leftArray[i] = leftArray[i-1] * nums[i-1];
        }
        rightArray[len-1] =  1;
        for(int i=len-2; i>=0; i--){
            rightArray[i] = rightArray[i+1] * nums[i+1];
        }
        for(int i=0; i < len; i++){
            mult = rightArray[i]*leftArray[i];
            last[i] = mult;
        }
        return last;

    }
}
