package Example;

public class SearchInSortedArray {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int target = 0;
        int res = search(arr,target);
        System.out.println(res);
    }
    public static int search(int[] arr, int target) {
        int length = arr.length;
        int left = 0, right = length - 1;
        while(right >= left){
            int mid = left + (right - left)/2;
            if(arr[mid] == target){
                return mid;
            }
            if(arr[mid] >= arr[left]){
                if(arr[mid] >= target && arr[left] <= target){
                    right = mid - 1;
                }else{
                    left = mid + 1;
                }
            } else {
                    if(arr[mid] <= target && arr[right] >= target){
                        left = mid + 1;
                    } else {
                        right = mid - 1;
                    }
                }
            }
        return -1;
    }
}
