package Example;

public class SortColors {
    public static void main(String[] args) {
        int[] nums = {0,2,2,2,1,1,0,0,1};
        sortColors(nums);

    }
    public static void sortColors(int[] nums) {
        int low = 0, mid = 0;
        int high = nums.length - 1;
        while (high >= mid) {
            if (nums[mid] == 0) {
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                mid++;
                low++;
            } else if (nums[mid] == 2) {
                int res = nums[mid];
                nums[mid] = nums[high];
                nums[high] = res;
                high--;
            } else {
                mid++;
            }
        }
        for(int i : nums){
            System.out.print(i+" ");
        }
    }
}
