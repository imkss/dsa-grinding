package sorting;

import java.util.Arrays;

public class D_Quick_Sort {
    public static void main(String[] args) {
        int[] nums = {2, 12, 43, 7, 11, 12, 8};
        sort(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }
    static void sort(int[] arr, int low, int high) {
        if(low >= high) return;
        int start = low;
        int end = high;
        int mid = (start + end) / 2;
        int pivot = arr[mid];
        while (start <= end) {
            while (arr[start] < pivot) {
                start++;
            }
            while (arr[end] > pivot) {
                end--;
            }
            if(start <= end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
        sort(arr, low, end);
        sort(arr, start, high);
    }
}
