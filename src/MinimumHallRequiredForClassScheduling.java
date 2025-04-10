import java.util.Arrays;
import java.util.HashMap;

public class MinimumHallRequiredForClassScheduling {
    public static void main(String[] args) {
        int[][] lectures = {{1,2},{2,3},{3,4}};
        int totalLecture = findTotalClass(lectures);
        System.out.println("Total min lectures : " + totalLecture);
    }
    public static int findTotalClass(int[][] lectures){

        int count = 0;
        Arrays.sort(lectures,(a,b) -> a[1]-b[1]);
        int[] prev = lectures[0];
        for(int i = 1; i < lectures.length; i++){
            int[] curr = lectures[i];
            if(prev[1] <= curr[0]){
                count++;
            }else{
                prev = curr;
            }
        }
        return count;

    }
}
