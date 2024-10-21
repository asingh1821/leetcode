package Example;

public class LongestCommonPrefix {
    public static void main(String[] args) {
     String s1 = "flower";
     String s2 = "lows";
//     System.out.println(commonPrefix(s1,s2));
     System.out.println(longestCommonPrefix(new String[]{"flower", "lu","flows","flind"}));
    }
    public static String commonPrefix(String s1,String s2) {
        StringBuilder s = new StringBuilder();
        int len = Math.min(s1.length(), s2.length());
        for (int i = 0; i < len; i++) {
            if (s1.charAt(i) == s2.charAt(i)) {
                s.append(s1.charAt(i));
            }else{
                break;
            }
        }
        return s.toString();
    }

    public static String longestCommonPrefix(String[] strs) {
        if(strs.length == 1){
            return strs[0];
        }
        String s4 = commonPrefix(strs[0],strs[1]);

        for (int i=2; i<strs.length; i++){
            if(s4.length() == 0){
                return "";
            }
            s4 = commonPrefix(s4,strs[i]);
        }
        return  s4;
    }
}

