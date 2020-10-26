package _70.ClimbingStairs;

/**
 * Reaching d[i] stair we can only from d[i-1] and d[i-2] stair, so:
 * d[i] = d[i-1] + d[i-2].
 * As we need only two d[i-1] and d[i-2], we don't have to keep whole d array, only two last sum of steps
 * By the way, those numbers are fibonacci sequence
 */
public class ClimbingStars {
    public int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        int oneBehind = 2;
        int secondBehind = 1;
        int actual = 0;
        for (int i = 3; i <= n; i++) {
            actual = oneBehind + secondBehind;
            secondBehind = oneBehind;
            oneBehind = actual;
        }
        return actual;
    }
}
