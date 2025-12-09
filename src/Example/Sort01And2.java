package Example;

public class Sort01And2 {
    public static void main(String[] args) {
    int[] arr = {0, 1, 2, 0, 1, 2};
    sort012(arr);
    }
    public static void sort012(int[] arr) {
            // code here
        int index = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0){
                arr[index++] = 0;
            }else if(arr[i] == 1){
                arr[index++] = 1;
            }else{
                arr[index++] = 2;
            }
        }
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}


