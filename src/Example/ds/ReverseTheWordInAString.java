package Example.ds;

public class ReverseTheWordInAString {
    public static void main(String[] args) {
        String s = "cb ipctpyru bovcbo";

        // output - "red are Roses"

        String result = reverseString(s);
        for(int i = 0; i < result.length(); i++){
            System.out.print(result.charAt(i));
        }

    }
    public static String reverseString(String s){
        String[] arr = s.split(" ");
        String t = "";
        for(int i = arr.length-1; i >= 0; i--){
            t += " "+ arr[i];
        }
        return t.trim();
    }
}
