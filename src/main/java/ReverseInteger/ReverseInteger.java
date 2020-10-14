package ReverseInteger;

public class ReverseInteger {
    //own impl with StringBuilder
    public int reverseWithStringBuilder(int x) {
        String number = String.valueOf(x);
        StringBuilder resultNumber = new StringBuilder();
        if(x < 0) {
            resultNumber.append("-");
            for (int i = number.length() - 1; i > 0; i--) {
                resultNumber.append(number.charAt(i));
            }
        }
        else
            for (int i = number.length() - 1; i >= 0; i--) {
                resultNumber.append(number.charAt(i));
            }
        long longResult = Long.valueOf(resultNumber.toString());
        if(longResult > Integer.MAX_VALUE || longResult < Integer.MIN_VALUE)
            return 0;
        return (int) longResult;
    }

    //better impl
    public int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            rev = rev * 10 + pop;
        }
        return rev;
    }
}
