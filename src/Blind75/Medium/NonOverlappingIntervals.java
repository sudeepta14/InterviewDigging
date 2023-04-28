package Blind75.Medium;
import java.util.*;
public class NonOverlappingIntervals {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt((int[] i)-> i[1]));
        int result = 0;
        int max = Integer.MIN_VALUE;

        for(int[] interval: intervals){
            if(interval[0] < max){
                result++;
            }else{
                max = interval[1];
            }
        }
        return result;
    }
}

/*
Time complexity : O(NLOGN)
Space complexity: O(1)
 */
