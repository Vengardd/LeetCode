package _76.MinimumWindowSubstring;

import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubstring {
    public String minWindow(String s, String t) {
        if(t.length() > s.length())
            return "";
        Map<Character, Integer> missingCharacters = new HashMap<>();
        int numberOfMissing = t.length();
        int[] resultIndexes = {0, Integer.MAX_VALUE};
        int slow = 0;
        int fast = 0;
        char[] string = s.toCharArray();
        char actualChar;

        initMissingCharacter(missingCharacters, t);

        for(fast = 0; fast < s.length(); fast++) {
            actualChar = string[fast];
            if (missingCharacters.containsKey(actualChar)) {
                missingCharacters.put(actualChar, missingCharacters.get(actualChar) - 1);
                if (missingCharacters.get(actualChar) >= 0)
                    numberOfMissing--;
            }
            while (numberOfMissing == 0) {
                if (fast - slow < resultIndexes[1] - resultIndexes[0]) {
                    resultIndexes[0] = slow;
                    resultIndexes[1] = fast;
                }
                actualChar = string[slow];
                if (missingCharacters.containsKey(actualChar)) {
                    missingCharacters.put(actualChar, missingCharacters.get(actualChar) + 1);
                    if (missingCharacters.get(actualChar) > 0) {
                        numberOfMissing = 1;
                    }
                }
                slow++;
            }
        }
        if (numberOfMissing == 0 && fast - slow < resultIndexes[1] - resultIndexes[0]) {
            resultIndexes[0] = slow;
            resultIndexes[1] = fast;
        }
        return resultIndexes[1] == Integer.MAX_VALUE ? "" : s.substring(resultIndexes[0], resultIndexes[1] + 1);
    }



    private void initMissingCharacter(Map<Character, Integer> missingCharacters, String s) {
        for (char c :
                s.toCharArray()) {
            if (missingCharacters.containsKey(c))
                missingCharacters.put(c, missingCharacters.get(c) + 1);
            else
                missingCharacters.put(c, 1);
        }
    }
}
