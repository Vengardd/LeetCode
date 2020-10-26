package _746.MinCostClimbingStairs;

public class MinCostClimbingStairs {
    public int minCostClimbingStairs(int[] cost) {
        int onePrevious = cost[1];
        int secondPrevious = cost[0];
        int actual = Math.min(onePrevious, secondPrevious);
        for(int i = 2; i < cost.length; i++) {
            actual = cost[i] + Math.min(onePrevious, secondPrevious);
            secondPrevious = onePrevious;
            onePrevious = actual;
        }
        return actual;
    }
}
