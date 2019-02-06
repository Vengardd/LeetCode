package _9.PalindromeNumber;

public class PalindroneNumber {
    public boolean isPalindrome(int x) {
        if(x < 0)
            return false;
        if(x == reverseInt(x))
            return true;
        return false;
    }

    private int reverseInt(int x) {
        int rev = 0;
        while(x != 0) {
            int pop = x % 10;
            x /= 10;
            rev = rev * 10 + pop;
        }
        return rev;
    }
}
