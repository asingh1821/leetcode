package Example.ds;

public class RotateString {

    public static void main(String[] args) {
        String s = "abcde";
        String goal = "cdeab";
        boolean result = rotateString(s,goal);
        System.out.println(result);
    }
        public static boolean rotateString(String s, String goal) {
           if(s.length() != goal.length()){
               return false;
           }
           String addString = goal + goal;
           if(addString.contains(s)){
               return true;
           }
           return false;

        }
    }

