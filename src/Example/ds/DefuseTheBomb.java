package Example.ds;

public class DefuseTheBomb {
    public static void main(String[] args) {
        int[] code = {2,4,9,3};
        int k = -2;
        int[] res = decrypt(code, k);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]+" ");
        }
    }
          public static int[] decrypt(int[] code, int k) {
            int[] result = new int[code.length];
            int length = code.length;
            if (k == 0) {
                return result;
            } else if (k > 0) {
                for (int i = 0; i < code.length; i++) {
                    int sum = 0;
                    for (int j = i + 1; j <= Math.abs(k)+i; j++) {
                        sum += code[j % length];
                    }
                    result[i] = sum;
                }
            }else{
                for(int i = 0; i < length; i++){
                    int add = 0;
                    for(int j = -1; j >= k; j--){
                       int index = (i + j) % length;
                       if(index < 0) {
                           index = index + length;
                       }
                           add += code[index];
                    }
                    result[i] = add;
                }
            }
            return result;
        }
    }
