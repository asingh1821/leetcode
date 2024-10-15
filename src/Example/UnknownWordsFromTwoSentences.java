package Example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class UnknownWordsFromTwoSentences {

    public static void main(String[] args){
        String s1 = "this apple is sweet";
        String s2 = "this apple is sour";
        String[] result = uncommonFromSentences(s1,s2);
        for(int i=0; i<result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
    public static String[] uncommonFromSentences(String s1, String s2) {

        HashMap<String, Integer> hm = new HashMap<>();
        ArrayList<String> al = new ArrayList<>();
        String[] srr = new String[al.size()];
        for (String first : s1.split(" ")) {
            if (hm.containsKey(first)) {
                hm.put(first, hm.get(first) + 1);
            } else {
                hm.put(first, 1);
            }
        }
        for (String second : s2.split(" ")) {
            if (hm.containsKey(second)) {
                hm.put(second, hm.get(second) + 1);
            } else {
                hm.put(second, 1);
            }
        }
        for (Map.Entry<String, Integer> entry : hm.entrySet()) {
            if (entry.getValue() == 1) {
                al.add(entry.getKey());
            }
        }
        String[] res = new String[al.size()];
        al.toArray(res);
        return res;
    }

}

