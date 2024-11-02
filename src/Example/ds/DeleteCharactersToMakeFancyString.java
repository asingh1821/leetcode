package Example.ds;

public class DeleteCharactersToMakeFancyString {
    public static void main(String[] args) {
        String s = "aaabaaaa";
        String result = makeFancyString(s);
        System.out.print(result);
    }
    public static String makeFancyString(String s) {
        String result = "";
        int length = s.length();
        for(int i = 0; i < length-2; i++){
            if(s.charAt(i) == s.charAt(i+1) && s.charAt(i) == s.charAt(i+2)){

            }else{
                result += s.charAt(i);
            }
        }
        return result+s.charAt(length-2)+s.charAt(length-1);
    }
}

