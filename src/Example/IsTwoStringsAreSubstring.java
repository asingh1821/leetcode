package Example;

public class IsTwoStringsAreSubstring {

    public static void main(String[] args) {
        String s1 = "zuwaefl";
        String s2 = "uv";
        boolean result = isSubString(s1,s2);
        System.out.print(result);
    }
    public static boolean isSubString(String s1, String s2){
        int i = 0, j = s2.length();
        while(i < s1.length() && j < s2.length()){
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(j);
            if(c1 == c2){
                i++; j++;
            }else{
                i++;
            }
        }
        if(i == s1.length()-1 && j != s2.length()-1){
            return false;
        } else if (i == s1.length()-1 && j == s2.length()-1) {
            return s1.charAt(i) == s2.charAt(j);
        }
        return true;
    }
}
