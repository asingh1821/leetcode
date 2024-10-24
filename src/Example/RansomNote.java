package Example;

import java.util.HashMap;

public class RansomNote {
    public static void main(String[] args) {
        String ransomNote = "aaabbdd";
        String magazine  = "baaabccb";
        boolean b = canConstruct(ransomNote,magazine);
        System.out.println(b);
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> hmMag = new HashMap<>();
        int count = 0;
        for (int i = 0; i < magazine.length(); i++) {
            char c1 = magazine.charAt(i);
            if (hmMag.containsKey(c1)) {
                hmMag.put(c1, hmMag.get(c1) + 1);
            } else {
                hmMag.put(c1, 1);
            }
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            char c2 = ransomNote.charAt(i);
            if (hmMag.containsKey(c2) && hmMag.get(c2) > 0) {
                hmMag.put(c2, hmMag.get(c2) - 1);
            } else {
                return false;
            }
        }
        return true;
    }
}

