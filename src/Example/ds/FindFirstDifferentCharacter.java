package Example.ds;

import java.util.HashMap;
import java.util.Map;

public class FindFirstDifferentCharacter {
    public static void main(String[] args) {
        String s = "aabccddeeffg";
         char result = findFirstDifferent(s);
        System.out.println(result);
    }
    public static Character findFirstDifferent(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(map.containsKey(c)){
                map.put(c, map.get(c)+1);
            }else {
                map.put(c, 1);
            }
        }
        System.out.println(map);
        for (int i = 0; i < s.length(); i++) {
            char n = s.charAt(i);
            if (map.get(n) == 1){
                return n;
            }
        }
        return  0;
    }
}
