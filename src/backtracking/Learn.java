package backtracking;

import java.util.ArrayList;
import java.util.List;

public class Learn {
    public static void main(String[] args) {
//        List<String> output = generateParenthesis(3);
//        System.out.println(output);
//        subSeqString("abc");
//        String s = "sunny";
//        System.out.println(s.substring(1));
        int[] nums = {1,2,3};
        List<List<Integer>> ans = new ArrayList<>();
        ans = subsets(nums);
        System.out.println(ans);
    }

    public static List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        backtrack(ans, "", 0,0, n);
        return ans;
    }
    public static void backtrack(List<String> output, String str, int opn, int cls, int max) {
//     Base case: A valid combination must use all pairs, so total length is 2 * max

       if(str.length() == max * 2) {
           output.add(str);
           return;
       }
//     Recursive call :: Accumulate the string by adding "("
       if(opn < max) backtrack(output, str+"(", opn + 1, cls, max);
//     Recursive call :: Accumulate the string by adding ")"
       if(cls < opn) backtrack(output, str+")", opn, cls + 1, max);
    }

//    The whole logic for creating all possible combination is :: either pick an element or ignore it
//    in helper method we pass two parameter 1.processed 2.unprocessed
    public static void subSeqString(String str) {
        helper("", str);
    }
    public static void helper(String processed, String unprocessed) {
        if (unprocessed.isEmpty()) {
            System.out.println(processed);
            return;
        }
        char ch = unprocessed.charAt(0);
        helper(processed + ch, unprocessed.substring(1));
        helper(processed, unprocessed.substring(1));
    }


    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(0, nums, new ArrayList<>(), result);
        return result;
    }

    private static void backtrack(int i, int[] nums, List<Integer> current, List<List<Integer>> result) {
        // Base case: if we've considered all elements, add a copy of the current subset
        if (i == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }
        // Choice 1: Include nums[i]
        current.add(nums[i]);
        backtrack(i + 1, nums, current, result);
        // Backtrack (undo the choice)
        current.remove(current.size() - 1);
        // Choice 2: Exclude nums[i]
        backtrack(i + 1, nums, current, result);
    }
}
