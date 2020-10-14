package LongestCommonPrefix;

import java.util.Arrays;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length <= 0) {
            return "";
        } else if (strs.length == 1) {
            return strs[0];
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strs[0].length(); i++) {
            for (int j = 1; j < strs.length; j++) {
                if (strs[0].length() < strs[j].length() && strs[0].charAt(i) != strs[j].charAt(i)) {
                    return sb.toString();
                }
            }
            sb.append(strs[0].charAt(i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        LongestCommonPrefix lcp = new LongestCommonPrefix();

        String lcp1 = lcp.longestCommonPrefix((String[]) Arrays.asList("ab", "a").toArray());
        System.out.println(lcp1);

        String lcp2 = lcp.longestCommonPrefix((String[]) Arrays.asList("a", "ab").toArray());
        System.out.println(lcp2);
    }
}
