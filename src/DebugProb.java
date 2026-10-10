import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class DebugProb {

//    public static List<List<String>> groupAnagrams(String[] strs) {
//
//        HashMap<String, List<String>> map = new HashMap<>();
//
//        for (String s : strs) {
//
//            int[] count = new int[26];
//
//            for (char c : s.toCharArray()) {
//                count[c - 'a']++;
//            }
//
//            String key = Arrays.toString(count);
//
//            if (!map.containsKey(key)) {
//                map.put(key, new ArrayList<>());
//            }
//
//            map.get(key).add(s);
//        }
//
//        return new ArrayList<>(map.values());
//    }


//    public static int pivotIndex(int[] nums) {
//        int totalSum = 0;
//        for(int n : nums) {
//            totalSum += n;
//        }
//        int leftSum = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if (leftSum == totalSum - leftSum - nums[i]) {
//                return i;
//            }
//        }
//        return -1;
//    }

//    public static boolean checkSubarraySum(int[] nums, int k) {
//        int n = nums.length;
//        for(int i = 0; i < n; i++) {
//            int sum = 0;
//            for(int j = i; j < n; j++) {
//                sum += nums[j];
//                if(sum % 6 == 0) return true;
//            }
//        }
//        return false;
//    }

    public static void main(String[] args) {

//        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
//        List<List<String>> result = groupAnagrams(strs);
//        System.out.println(result);

        int[] nums = {2,4,6,7};
//        int ans = pivotIndex(nums);
//        boolean ans = checkSubarraySum(nums, 6);
    }
}