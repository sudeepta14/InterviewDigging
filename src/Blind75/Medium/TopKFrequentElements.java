package Blind75.Medium;
import java.util.*;
public class TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num: nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }

        PriorityQueue<Map.Entry<Integer,Integer>> pq = new PriorityQueue<>((a, b) -> a.getValue() - b.getValue());

        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            pq.offer(entry);
            if(pq.size() > k){
                pq.poll();
            }
        }

        int[] result = new int[k];
        int i=0;

        while(!pq.isEmpty()){
            result[i++] = pq.poll().getKey();
        }
        return result;

    }
}

/*
Time complexity : O(NLogk)
Space Complexity: O(K)
 */