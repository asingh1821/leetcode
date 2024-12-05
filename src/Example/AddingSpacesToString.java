package Example;

public class AddingSpacesToString {
    public static void main(String[] args) {
        String s = "LeetcodeHelpsMeLearn";
        int[] spaces = {8,13,15};
        String res = addSpaces(s,spaces);
        for(int i = 0; i < res.length(); i++){
            System.out.print(res.charAt(i));
        }
    }
    public static String addSpaces(String s, int[] spaces) {
        int count = 0;
        StringBuilder sb = new StringBuilder();
        int j = 0;
        for(int i = 0; i < spaces.length; i++){
            sb.append(s.substring(j,spaces[i]));

            sb.append(" ");
            j = spaces[i];
        }
        return sb.toString();
    }
}
