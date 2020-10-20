package _32.LongestValidParentheses;

public class LongestValidParentheses {
    public int longestValidParentheses(String s) {
        int maxValidLength = 0;
        int parentheses;
        boolean isValid;
        for (int i = 0; i < s.length(); i++) {
            isValid = true;
            parentheses = 0;
            for (int j = i; j < s.length() && isValid; j++) {
                if (s.charAt(j) == '(') {
                    parentheses++;
                } else {
                    parentheses--;
                }
                if (parentheses < 0) {
                    isValid = false;
                }
                if(parentheses == 0) {
                    maxValidLength = Math.max(j - i + 1, maxValidLength);
                }
            }
        }
        return maxValidLength;
    }
}
