package array;

import java.util.HashMap;

public class LongestSubArrWithSumK {
    public static void main(String[] args) {
//                int[] arr = {10, 5, 2, 7, 1, -1, 1, 9};

//        int[] arr = {10, 5, 2, 7, 1, 9};

        int[] arr = {1, 4, -2, 3};

        // Brute Force Approach
//        System.out.println("longest subArray with sum 15 (positive) ::" + bruteForce(arr, 15));

        // Better Approach for Positive values & Optimal for Zeros/negative
        System.out.println("longest subArray with sum 15 :: " + longestSubarrWithSumK(arr, 3));

//      Optimal two pointer greedy approach
        System.out.println("longest subArray with sum 15 :: " + longestSubarrWithSumKInNonNegArr(arr, 3));


    }


    public static int bruteForce(int[] arr, int k){
        int n = 6;
        int len = 0;
        for(int i = 0; i < n; i++) {
            int sum = 0;
            for(int j = i; j < n; j++) {
                sum += arr[j];
                if(sum == k){
                    len = Math.max(len, j - i + 1);
                }
            }
        }
        return len;
    }

    public static int longestSubarrWithSumK(int[] nums, long k) {
        HashMap<Long, Integer> preSumMap = new HashMap<>();

        long sum = 0;
        int maxLen = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            // If the entire subarray from 0 to i has sum k
            if (sum == k) {
                maxLen = Math.max(maxLen, i + 1);
            }
            long rem = sum - k;
            // Check if there exists a prefix sum = sum - k
            if (preSumMap.containsKey(rem)) {
                int len = i - preSumMap.get(rem);
                maxLen = Math.max(maxLen, len);
            }
            // Store the first occurrence of the prefix sum
            if (!preSumMap.containsKey(sum)) {
                preSumMap.put(sum, i);
            }
        }
        return maxLen;
    }

    public static int longestSubarrWithSumKInNonNegArr(int[] nums, int k) {
        int left = 0, right = 0;
        long sum = nums[0];
        int maxLen = 0;
        int n = nums.length;

        while(right < n) {
        while (left <= right && sum > k){
            sum -= nums[left];
            left++;
        }
        if(sum == k) {
            maxLen = Math.max(maxLen, right - left + 1);
        }
            right++;
            if(right < n) sum += nums[right];
        }
    return maxLen;
    }
}
