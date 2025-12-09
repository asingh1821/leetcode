package Example;

import java.util.Arrays;

public class MergeWithoutExtraSpace {
    public static void main(String[] args) {
        int[] a = {1, 5, 9, 10, 15, 20};
        int[] b = {2, 3, 8, 13};
        mergeArrays(a,b);
    }
    public static void mergeArrays(int a[], int b[]) {
        // code here
        int i = a.length-1;
        int j = 0;
        while(i >= 0 && j < b.length){
            if(a[i] < b[j]){
                j++;
                i--;
            }else if(a[i] >= b[j]){
                int temp = b[j];
                b[j] = a[i];
                a[i] = temp;
                i--;
                j++;
            }
        }
        Arrays.sort(a);
        Arrays.sort(b);
        for(int k : a){
            System.out.print(k+" ");
        }
        System.out.println("................");
        for(int l : b){
            System.out.print(l+" ");
        }
    }
}
