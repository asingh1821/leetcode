package Example.ds;

public class CircularSentence {
    public static void main(String[] args) {
        String sentence = "MuFoevIXCZzrpXeRmTssj lYSW U jM";
        boolean result = isCircularSentence(sentence);
        System.out.println(result);
    }
        public static boolean isCircularSentence(String sentence) {
            int length = sentence.length();
            boolean flag = false;
            for (int i = 0; i < length; i++) {
                char c = sentence.charAt(i);
                if (c == ' ') {
                    if (sentence.charAt(i - 1) == sentence.charAt(i + 1)) {
                        flag = true;
                        continue;
                    } else {
                        return false;
                    }
                }
                if((sentence.charAt(0) == sentence.charAt(length - 1)) && flag == true){
                    return true;
                }
            }
            return false;
        }
    }

