package Example;

public class TakeGiftsFromRichestPile {
    public static void main(String[] args) {
       int[] gifts = {25,64,9,4,100};
       int k = 4;
       long res = pickGifts(gifts, k);
       System.out.print(res);
    }
    public static long pickGifts(int[] gifts, int k) {
        int index = 0;
        for(int i = 0; i < k; i++){
            int maxNumber = Integer.MIN_VALUE;
            for(int j = 0; j < gifts.length; j++){
                if(maxNumber < gifts[j]){
                    maxNumber = gifts[j];
                    index = j;
                }
            }
            int squareRoot = (int)Math.sqrt(gifts[index]);
            gifts[index] = squareRoot;
        }
        long sum = 0;
        for(int i = 0; i < gifts.length; i++){
            sum += gifts[i];
        }
        return sum;
    }
}
