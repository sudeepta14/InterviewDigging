package Blind75.Medium;
import java.util.*;

public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        helper(result, new ArrayList<>(), candidates, target, 0);
        return result;
    }

    public void helper(List<List<Integer>> result, List<Integer> tempList, int[] candidates, int target, int index) {
        if (target <= 0) {
            if (target == 0) {
                result.add(new ArrayList<>(tempList));
            }
            return;
        }
        for (int i = index; i < candidates.length; i++) {
            tempList.add(candidates[i]);
            helper(result, tempList, candidates, target - candidates[i], i);
            tempList.remove(tempList.size() - 1);
        }
    }
}

/*
Let N be the number of candidates, T be the target value, and M be the minimal value among the candidates.
O(N ^ t/m+1)
O(t/m)
 */
