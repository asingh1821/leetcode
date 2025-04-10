package Example;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        int m = 3;
        int n = 3;

        merge(nums1,m,nums2,n);
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] nums = new int[m+n];
        int index = 0;
        int i = 0, j = 0;
        while(i < m && j < n){
            if(nums1[i] <= nums2[j]){
                nums[index] = nums1[i];
                index++;
                i++;
            }else{
                nums[index] = nums2[j];
                index++;
                j++;
            }
        }
        for(int k = 0; k < nums.length; k++){
            System.out.print(nums[k] +" ");
        }
    }
}
