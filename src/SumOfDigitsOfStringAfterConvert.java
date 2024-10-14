public class SumOfDigitsOfStringAfterConvert {

    public static void main(String[] args) {
       int res =  getLucky("vbyytoijnbgtyrjlsc", 2);
       System.out.println(res);
    }
    public static int getLucky(String s, int k) {
        int value = 0,sum = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            value = (int) (c - 'a' + 1);
            if (value < 9) {
                sum += value;
            } else {
                while (value != 0) {
                    int rem = value % 10;
                    sum += rem;
                    value = value / 10;
                }
            }
        }


        if(k == 1){
            return sum;
        }
        for (int i = 2; i <= k; i++) {
            int add = 0;
            while (sum != 0) {
                int rem = sum % 10;
                add += rem;
                sum = sum / 10;
            }
            sum = add;
        }
        return sum;
    }
}

