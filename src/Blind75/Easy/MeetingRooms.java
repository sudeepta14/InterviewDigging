package Blind75.Easy;
import java.util.Arrays;
import java.util.Comparator;

class MeetingRooms {
    public boolean canAttendMeetings(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt((int[] i) -> i[0])); // sorted by start time

        for(int i=0; i<intervals.length-1; i++){
            if(intervals[i][1] > intervals[i+1][0]){ // checking if end time of prev interval > start time of next interval
                return false;
            }
        }
        return true;
    }
}