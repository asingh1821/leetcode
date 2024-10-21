package Example;

public class LengthOfLastWord {

    public static void main(String[] args) {
        String s = "    luffy is still joyboy   ";
        int len = lengthOfLastWord(s);
        System.out.println(len);
    }
    public static int lengthOfLastWord(String s) {
        System.out.println(s.length());
        s = s.trim();
        System.out.println(s.length());
        int count = 0;
        for(int i=s.length()-1; i>=0; i-- ){
            if(s.charAt(i) == ' '){
                break;
            }else{
                count++;
            }
        }
        return count;
    }
}

