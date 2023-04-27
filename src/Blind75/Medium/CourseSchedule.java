package Blind75.Medium;
import java.util.*;
public class CourseSchedule {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[] indegree = new int[numCourses];
        List<Integer>[] graph = new ArrayList[numCourses];

        for(int i=0; i<numCourses; i++){
            graph[i] = new ArrayList<>();
        }

        for(int[] pre: prerequisites){
            indegree[pre[0]]++;
            graph[pre[1]].add(pre[0]);
        }

        Queue<Integer> queue = new LinkedList<>();
        int edgeCount = prerequisites.length;

        for(int i=0; i<indegree.length; i++){
            if(indegree[i] == 0){
                queue.offer(i);
            }
        }

        while(!queue.isEmpty()){
            int curr = queue.poll();
            for(int next: graph[curr]){
                indegree[next]--;
                edgeCount--;
                if(indegree[next] == 0){
                    queue.offer(next);
                }
            }
        }
        return edgeCount==0;
    }

    /*
    Time complexity : O(V+E)
    Space complexity: O(V+E)
     */
}
