package recursion;

public class Basics {
    public static void main(String[] args) {
        int[] nums = {2,4,6,7};
//        int ans = pivotIndex(nums);
//        boolean ans = checkSubarraySum(nums, 6);
//        long ans = factorial(5);
//        System.out.println(ans);
        System.out.println(arraySum(nums));
    }

    public static int numSum(int n) {
        if(n == 0) return 0;
        return n + numSum(n - 1);
    }

    public static long factorial(int n) {
        if (n == 0 || n == 1) return 1;
        return (long) n * factorial(n - 1);
    }

    public static int arraySum(int[] arr) {
        return addFrom(arr, 0);
    }

    public static int addFrom(int[] arr, int ind) {
        if(ind == arr.length) return 0;
        return arr[ind] + addFrom(arr, ind + 1);
    }
}
