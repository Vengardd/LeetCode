package RomanToInteger;

public class RomanToInteger {
    public int romanToInt(String s) {
        int result = 0;
        int previousValue = 0;
        int actualValue;
        for (char actualChar:
             s.toCharArray()) {
            actualValue = singleRomanCharToInt(actualChar);
            if(actualValue > previousValue)
                result-=2*previousValue;
            previousValue = actualValue;
            result+=actualValue;
        }
        return result;
    }

    private int singleRomanCharToInt(char c) {
        switch (c) {
            case 'M':
                return 1000;
            case 'D':
                return 500;
            case 'C':
                return 100;
            case 'L':
                return 50;
            case 'X':
                return 10;
            case 'V':
                return 5;
            case 'I':
                return 1;
            default:
                throw new RuntimeException();
        }
    }
}
