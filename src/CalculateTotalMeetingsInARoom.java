import java.util.Arrays;

public class CalculateTotalMeetingsInARoom extends Thread{
    public static void main(String[] args) {
        int[] start = {3,5,8,13,16,23,25};
        int[] end = {4,7,12,27,19,25,29};
        int totalMeetings = findMaxMeetings(start,end);
        System.out.println("Total meetings : "+totalMeetings);
    }
    public static int findMaxMeetings(int[] start, int[] end){
        Arrays.sort(start);
        Arrays.sort(end);
        int i = 1,j = 0, count = 0;
        while(i < start.length && j < end.length){
            if(start[i] <= end[j]){
                count++;
            }else{
                j++;
            }
        }
        return count;
    }
}
