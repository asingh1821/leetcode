package Example;

public class FindMaxElementInTwoDArray {
    public static void main(String[] args) {
        int[][] a = {{1},{2,3},{7,1,-2},{9,5,-8,0}};
        int res = findHighest(a);
        System.out.println(res);
    }
    public static int findHighest(int[][] a){
        int maxElement = 0;
        for(int i = 0; i < a.length; i++){
            int[] x = a[i];
            for(int j = 0; j < a[i].length; j++){
                if(maxElement < x[j]){
                    maxElement = x[j];
                }
            }
        }
        return maxElement;
    }
}
