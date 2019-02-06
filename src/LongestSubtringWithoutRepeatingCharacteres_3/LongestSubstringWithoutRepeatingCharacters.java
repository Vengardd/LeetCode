package LongestSubtringWithoutRepeatingCharacteres_3;

public class LongestSubstringWithoutRepeatingCharacters {

    // Test
    public static void main(String[] args) {
        long t1, t2;
        t1 = System.currentTimeMillis();
        LongestSubstringWithoutRepeatingCharacters l = new LongestSubstringWithoutRepeatingCharacters();
        System.out.println(l.lengthOfLongestSubstring("abcabcbb"));
        t2 = System.currentTimeMillis();
        System.out.println((t2 - t1) % 1000);
    }

    //linear
    public int lengthOfLongestSubstring(String s) {
        if(s.length() > 0) {
            int currentLength = 1;
            int maxLength = 1;
            int previousIndex;
            int[] visited = new int[256];
            for (int i = 0; i < visited.length; i++) {
                visited[i] = -1;
            }
            visited[s.charAt(0)] = 0;

            for (int i = 1; i < s.length(); i++) {
                previousIndex = visited[s.charAt(i)];
                if (previousIndex == -1 || i - currentLength > previousIndex)
                    currentLength++;
                else {
                    if (currentLength > maxLength)
                        maxLength = currentLength;
                    currentLength = i - previousIndex;
                }
                visited[s.charAt(i)] = i;
            }
            if (currentLength > maxLength)
                return currentLength;
            return maxLength;
        } else return 0;
    }

    //Brute Force, Time complexicity: O(n^3)
    public int lengthOfLongestSubstringBruteForce(String s) {
        StringBuffer actualSubstring;
        String longestSubstring = "";
        for (int i = 0; i < s.length(); i++) {
            String subString = s.substring(i);
            actualSubstring = new StringBuffer();
            for (char c :
                    subString.toCharArray()) {
                String actualChar = String.valueOf(c);
                if (actualSubstring.toString().contains(actualChar)) {
                    if (actualSubstring.toString().length() > longestSubstring.length())
                        longestSubstring = actualSubstring.toString();
                    actualSubstring = new StringBuffer();
                }
                actualSubstring.append(actualChar);
            }
            if (actualSubstring.toString().length() > longestSubstring.length())
                longestSubstring = actualSubstring.toString();
        }
        return longestSubstring.length();
    }

}
