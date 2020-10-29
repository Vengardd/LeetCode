package _56.MergeIntervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals {
    public int[][] merge(int[][] intervals) {
        if (intervals.length < 1) {
            return intervals;
        }

        Arrays.sort(intervals, Comparator.comparingInt(i -> i[0]));

        List<int[]> results = new ArrayList<>();
        int[] lastInterval = intervals[0];
        results.add(lastInterval);
        for (int[] interval : intervals) {
            if (interval[0] <= lastInterval[1]) {
                lastInterval[1] = Math.max(interval[1], lastInterval[1]);
            } else {
                lastInterval = interval;
                results.add(lastInterval);
            }
        }

        return results.toArray(new int[results.size()][]);
    }
}
