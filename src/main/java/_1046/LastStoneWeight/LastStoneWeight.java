package _1046.LastStoneWeight;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class LastStoneWeight {
    public int lastStoneWeight(int[] stones) {
        Queue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());
        for(int stone: stones) {
            queue.add(stone);
        }
        while(queue.size() >= 2) {
            int first = queue.poll();
            int second = queue.poll();
            if(first != second) {
                queue.add(first - second);
            }
        }
        if(queue.size() == 1) {
            return queue.poll();
        }
        return 0;
    }
}
