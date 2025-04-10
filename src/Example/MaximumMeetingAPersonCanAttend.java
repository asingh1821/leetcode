package Example;

import java.util.Arrays;

public class MaximumMeetingAPersonCanAttend {
    public static void main(String[] args) {
        int[][] meeting = {{3,4},{5,7},{8,12},{13,27},{16,19},{23,25},{25,29}};
        int res = totalMaxMeetings(meeting);
        System.out.println("total meeting a person can attend is : " + res);
    }
    public static int totalMaxMeetings(int[][] meeting){
        Arrays.sort(meeting,(a, b) -> a[1]-b[1]);
        int count = 1;
        int[] prev = meeting[0];
        for(int i = 1; i < meeting.length; i++) {
            int[] curr = meeting[i];
            if (prev[1] <= curr[0]) {
                count++;
                prev = curr;
            }
        }
        return count;
    }
}
