package Example;

public class RemoveDUplicateFromSortedArray {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int res = removeDuplicates(nums);
        System.out.println(res);

    }
        public static int removeDuplicates(int[] nums) {
            int index = 0, i = 0, j = 0;
            while(i < nums.length && j < nums.length){
                if(nums[i] == nums[j]){
                    j++;
                }else{
                    nums[index++] = nums[i];
                    i = j;
                }
            }
            nums[index++] = nums[nums.length-1];
            for(int k = 0; k < index; k++){
                System.out.print(nums[k] + " ");
            }
            System.out.println("...........");
            return index;
        }
    }

