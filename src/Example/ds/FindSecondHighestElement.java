package Example.ds;

public class FindSecondHighestElement {
    public static void main(String[] args) {
        int[] arr = {1,3,5,6,-2,6,2,10,10,10,7};
        findSecondHighest(arr);
    }
    public static void findSecondHighest(int[] arr){
        int maxValue = 0, secondLargest = -1;
        for (int i = 0; i < arr.length; i++){
            maxValue = Math.max(maxValue,arr[i]);
        }
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > secondLargest && arr[i] < maxValue){
                secondLargest = arr[i];
            }
        }

        System.out.println(secondLargest);
    }
}
