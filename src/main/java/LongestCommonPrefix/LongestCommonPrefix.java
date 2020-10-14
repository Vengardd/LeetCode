package LongestCommonPrefix;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class LongestCommonPrefix {
    public String longestCommonPrefix1(String[] strs) {
        if (strs.length <= 0) {
            return "";
        } else if (strs.length == 1) {
            return strs[0];
        }
        if (Arrays.asList(strs).contains("")) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        String actualComparingWord;
        String firstWord = strs[0];
        for (int i = 0; i < strs[0].length(); i++) {
            for (int j = 1; j < strs.length; j++) {
                actualComparingWord = strs[j];
                if (actualComparingWord.length() <= i || firstWord.charAt(i) != actualComparingWord.charAt(i)) {
                    return sb.toString();
                }
            }
            sb.append(firstWord.charAt(i));
        }
        return sb.toString();
    }

    public String longestCommonPrefix(String[] strs) {
        return Arrays.stream(strs)
                .flatMap(s -> Stream.of(strs)
                        .map(t -> new Pair<>(s, t)))
                .map(this::commonPrefix)
                .min(Comparator.comparingInt(String::length))
                .orElse("");
    }

    private String commonPrefix(Pair<String> pair) {
        return commonPrefix(pair.getFirst(), pair.getSecond());
    }

    private String commonPrefix(String s1, String s2) {
        int shorterWordLength = Math.min(s1.length(), s2.length());
        for(int i = 0; i < shorterWordLength; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return s1.substring(0, i);
            }
        }
        return s1;
    }

    public class Pair<T> {
        private T first;
        private T second;

        public Pair() {
        }

        public Pair(T first, T second) {
            this.first = first;
            this.second = second;
        }

        public T getFirst() {
            return first;
        }

        public void setFirst(T first) {
            this.first = first;
        }

        public T getSecond() {
            return second;
        }

        public void setSecond(T second) {
            this.second = second;
        }
    }
}
