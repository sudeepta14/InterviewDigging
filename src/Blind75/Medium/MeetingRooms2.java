package Blind75.Medium;
import java.util.*;
public class MeetingRooms2 {
    public int minMeetingRooms(int[][] intervals) {
        int n = intervals.length;
        int[] start = new int[n];
        int[] end = new int[n];

        for(int i=0; i<intervals.length; i++){
            start[i] = intervals[i][0];
            end[i] = intervals[i][1];
        }

        Arrays.sort(start);
        Arrays.sort(end);

        int rooms = 0, prev = 0;

        for(int i=0; i<n; i++){
            rooms++;
            if(start[i] >= end[prev]){
                rooms--;
                prev++;
            }
        }
        return rooms;
    }
}
