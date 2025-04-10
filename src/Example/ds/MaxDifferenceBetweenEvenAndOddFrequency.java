package Example.ds;

import java.util.HashMap;
import java.util.Map;

public class MaxDifferenceBetweenEvenAndOddFrequency {
    public static void main(String[] args) {
        String s = "abcabcab";
        int diff = maxDifference(s);
        System.out.println(diff);

    }

        public static int maxDifference(String s) {
            HashMap<Character,Integer> map = new HashMap<>();
            for(int i = 0; i < s.length(); i++){
                char c = s.charAt(i);
                if(map.containsKey(c)){
                    map.put(c,map.get(c)+1);
                }else{
                    map.put(c,1);
                }
            }
            int evenValue = 0, maxValue = 0;
            for(Map.Entry<Character,Integer> entry : map.entrySet()){
                if(entry.getValue() %2 == 0){
                    evenValue= entry.getValue();
                    System.out.println(evenValue);
                }else{
                    maxValue = Integer.max(maxValue,entry.getValue());

                }
            }

            return maxValue-evenValue;
        }
    }
