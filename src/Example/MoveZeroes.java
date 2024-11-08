package Example;

public class MoveZeroes {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes(nums);
    }

    public static void moveZeroes(int[] nums) {
        int length = nums.length;
        if (length == 1) {

        }
        int count = 0;
        for (int i = 0; i < length; i++) {
            if (nums[i] != 0) {
                nums[count] = nums[i];
                nums[i] = 0;
                count++;
            }
        }
        for(int i = 0; i<length; i++){
            System.out.print(nums[i] + " ");
        }
    }
}