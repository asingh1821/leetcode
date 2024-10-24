package Example;

public class FindTheIndexOfFirstOccurenceInAString {

    public static void main(String[] args) {
        String haystack = "bsadutsad";
        String needle = "sad";
        int index = strStr(haystack,needle);
        System.out.println(index);
    }
    public static int strStr(String haystack, String needle) {

        int needleLength = needle.length();
        for(int i=0; i<haystack.length()-needleLength+1; i++){
            System.out.println(haystack.substring(i,needleLength+i));
            if(haystack.substring(i,needleLength+i).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}

