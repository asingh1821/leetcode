package Example;

import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2,5,5,11};
        int target = 10;
        int[] result = twoSum(nums,target);
        for(int i = 0; i < result.length; i++){
            System.out.print(result[i] + " ");
        }
    }
    public static int[] twoSum(int[] nums, int target) {
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                map.put(nums[i], i);
            }
            for (int j = 0; j < nums.length; j++) {
                int diff = target - nums[j];
                if (map.containsKey(diff) && map.get(diff) != j) {
                    return new int[] { j, map.get(diff) };
                    //create an array and will return the both value's index
                }
            }
            return new int[] {};

        }
    }

