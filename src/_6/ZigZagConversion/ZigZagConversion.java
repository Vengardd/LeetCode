package _6.ZigZagConversion;

public class ZigZagConversion {
    public static void main(String[] args) {
        ZigZagConversion zg = new ZigZagConversion();
        System.out.println(zg.convert("ABC", 3));
    }

    public String convert(String s, int numRows) {
        if (numRows > 1) {
            StringBuilder[] rows = new StringBuilder[numRows];
            for (int i = 0; i < numRows; i++) {
                rows[i] = new StringBuilder();
            }
            int index = 0;
            boolean goingDown = false;

            for(char c: s.toCharArray()) {
                rows[index].append(c);
                if(index == 0 || index == numRows - 1)
                    goingDown = !goingDown;
                index += goingDown ? 1 : -1;
            }
            StringBuilder ret = new StringBuilder();
            for (StringBuilder sb:
                 rows) {
                ret.append(sb.toString());
            }
            return ret.toString();
        } return s;
    }
}
