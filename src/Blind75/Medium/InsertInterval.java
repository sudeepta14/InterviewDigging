package Blind75.Medium;
import java.util.*;
public class InsertInterval {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> list = new ArrayList<>();

        int[] pre = newInterval;

        for(int[] cur: intervals){
            if(pre[1] < cur[0]){
                list.add(pre);
                pre = cur;
            }else if(cur[1] < pre[0]){
                list.add(cur);
            }
            else{
                pre[0] = Math.min(pre[0], cur[0]);
                pre[1] = Math.max(pre[1], cur[1]);
            }
        }
        list.add(pre);
        return list.toArray(new int[list.size()][]);
    }
}
