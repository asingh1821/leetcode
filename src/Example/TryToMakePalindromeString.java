package Example;

import java.util.HashMap;
import java.util.Map;

public class TryToMakePalindromeString {

        public static void main(String[] args) {
            String str = "ababc";
            //Expected answer is : true

            boolean isPalindromePossible = checkPalindromePossibility(str);
            System.out.println("Is palindrome possible ? : " + isPalindromePossible);
        }

        static boolean checkPalindromePossibility(String str){
            HashMap<Character,Integer> map = new HashMap<>();
            boolean countOneValueOnly = false;
            for(int i = 0; i < str.length(); i++){
                char c = str.charAt(i);
                if(!map.containsKey(c)){
                    map.put(c, 1);
                }else{
                    map.put(c, map.get(c)+1);
                }
            }
            for(int i = 0; i < str.length(); i++){
                char c1 = str.charAt(i);
                int frequency = map.get(c1);
                if(frequency % 2 == 0){
                    continue;
                }else if(frequency == 1 ){
                    if(countOneValueOnly = false){
                        countOneValueOnly = true;
                    }else{
                        return false;
                    }
                    continue;
                }else{
                    return false;
                }
            }
            return true;
        }
}


