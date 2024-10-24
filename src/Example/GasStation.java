package Example;

public class GasStation {
    public static void main(String[] args) {
        System.out.println(canCompleteCircuit(new int[]{1,2,3,4,5}, new int[]{3,4,5,1,2}));
    }
    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int index = -1, sum=0, diff=0;
        for(int i=0; i<gas.length; i++){
            diff = cost[i] - gas[i];
            if(diff >= 0 && index == -1) {
                index = i;
            }
            sum += diff;
            if(sum < 0) {
                index = -1;
            }
        }
        return index;
    }
}
