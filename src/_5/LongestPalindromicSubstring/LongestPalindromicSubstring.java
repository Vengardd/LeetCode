package _5.LongestPalindromicSubstring;

public class LongestPalindromicSubstring {
    //Test
    public static void main(String[] args) {
        LongestPalindromicSubstring ls = new LongestPalindromicSubstring();
        String palindrom = ls.longestPalindrome("a");
        System.out.println(palindrom);
    }

    public String longestPalindrome(String s) {
        if(s.length() > 1) {
            String actualLongestPalindrom = Character.toString(s.charAt(0));
            for (int i = 0; i < s.length() - 1; i++)
                for (int j = s.length(); j > i + 1; j--) {
                    try {
                        String substring = s.substring(i, j);
                        if (substring.length() > actualLongestPalindrom.length())
                            if (isPalindrom(substring))
                                actualLongestPalindrom = substring;
                    } catch (Exception e) {
                        System.out.println(i + ", " + j);
                    }
                }
            return actualLongestPalindrom;
        }
        return s;
    }

    private boolean isPalindrom(String s) {
        String reversed = reverseString(s);
        if (reversed.equals(s))
            return true;
        return false;
    }

    private String reverseString(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--)
            sb.append(s.charAt(i));
        return sb.toString();
    }
}
