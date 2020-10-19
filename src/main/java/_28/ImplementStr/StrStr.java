package _28.ImplementStr;

public class StrStr {
    public int strStr(String haystack, String needle) {
        if (needle.equals("")) {
            return 0;
        }
        if (haystack.length() == 0) {
            return -1;
        }
        char[] input = haystack.toCharArray();
        char[] inside = needle.toCharArray();
        for (int i = 0; i < input.length - inside.length + 1; i++) {
            if (input[i] == inside[0]) {
                boolean isInside = true;
                for (int j = 1; j < inside.length; j++) {
                    if (input[i + j] != inside[j]) {
                        isInside = false;
                        break;
                    }
                }
                if(isInside) {
                    return i;
                }
            }
        }
        return -1;
    }
}
