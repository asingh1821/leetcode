package Example;

public class ValidAnagram {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        boolean b = isAnagram(s,t);
        System.out.println(b);
    }
    public static boolean isAnagram(String s, String t) {

        int[] arr = new int[256];
        if(s.length() != t.length()){
            return false;
        }
        for(int i=0; i<arr.length; i++){
            arr[s.charAt(i)]++;
            arr[t.charAt(i)]--;
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 0){
                return true;
            }
        }
        return false;
    }
}

