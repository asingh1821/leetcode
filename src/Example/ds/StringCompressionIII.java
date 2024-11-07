package Example.ds;

public class StringCompressionIII {
    public static void main(String[] args) {
        String word = "aaaaaaaaay";
        String result = compressedString(word);
        System.out.println(result);
    }
    public static  String compressedString(String word) {
        char prev = word.charAt(0);
        int count = 1;
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < word.length(); i++) {
            char curr = word.charAt(i);
            if (prev == curr && count < 9) {
                count++;
            } else {
                sb.append(count);
                sb.append(prev);
                prev = curr;
                count = 1;
            }
        }
        sb.append(count);
        sb.append(prev);
        return sb.toString();
    }
}
