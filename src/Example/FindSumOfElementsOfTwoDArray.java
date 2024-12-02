package Example;

public class FindSumOfElementsOfTwoDArray {
    public static void main(String[] args) {
        int[][] a = {{1},{2,3},{7,1,-2},{9,5,-8,0}};
        int res = findSum(a);
        System.out.println(res);
    }
    public static int findSum(int[][] a){
        int sum = 0;
        for(int i = 0; i < a.length; i++){
            int[] x = a[i];
            for(int j = 0; j < a[i].length; j++){
                sum += x[j];
            }
        }
        return sum;
    }
}
