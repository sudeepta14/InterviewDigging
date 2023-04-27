package Blind75.Medium;
import java.util.*;
public class MergeIntervals {
    public int[][] merge(int[][] intervals) {
        if(intervals.length <= 1) return intervals;
        // sort by start time

        Arrays.sort(intervals, Comparator.comparingInt((int[] i) -> i[0])); // sort by ascending start

        LinkedList<int[]> merged = new LinkedList<>();

        for(int[] interval: intervals){
            if(merged.isEmpty() || merged.getLast()[1] < interval[0]){
                merged.add(interval);
            }else {
                merged.getLast()[1] = Math.max(merged.getLast()[1], interval[1]);
            }
        }
        return merged.toArray(new int[merged.size()][]);
    }
}

/*
Time complexity : O(NLOGN)
Space Complexity : O(LogN) --> complexity needed to sort
 */
