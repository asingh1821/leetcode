package Example.ds;

import java.util.Arrays;
import java.util.List;

public class SortData {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(33,11,44,22,99,80);
        int  index = 0;
        int minNum = list.get(0);
        for(int i = index+1; i < list.size(); i++) {
            minNum = Math.min(minNum, list.get(i));
            swap(list, i, index);
            index++;

        }

    }
    public static void swap(List<Integer> list, int left, int right) {
        int a = list.get(left);
        int b = list.get(right);
        int temp = a;
        a = b;
        b = temp;
    }
}
