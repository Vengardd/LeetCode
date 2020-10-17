package _1431.KidsWithTheGreatestNumberOfCandies;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandies = Arrays.stream(candies)
                .max().orElseThrow(RuntimeException::new);
        List<Boolean> results = new ArrayList<>(candies.length);
        for(int i = 0; i < candies.length; i++) {
            results.add(i, candies[i] + extraCandies >= maxCandies);
        }
        return results;
    }
}
