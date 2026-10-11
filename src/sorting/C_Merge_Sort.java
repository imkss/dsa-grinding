package sorting;

import java.util.Arrays;

public class C_Merge_Sort {
    public static void main(String[] args) {
    int[] num = {21, 3, 4, 54, 1, 12, 21};
//    int [] ans = mergeSort(num);
//    System.out.println(Arrays.toString(ans));

    mergeSortInPlace(num, 0, num.length);
    System.out.println(Arrays.toString(num));


}
    public static int[] mergeSort(int[] arr) {
        if(arr.length == 1) return arr;
        int mid = arr.length / 2;
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
        return merge(left, right);
    }
    public static int[] merge(int[] first, int[] second) {
        int l = 0, r = 0, k = 0;
        int[] mix = new int[first.length + second.length];
        while(l < first.length && r < second.length) {
            if(first[l] < second[r]) {
                mix[k] = first[l];
                l++;
            } else {
                mix[k] = second[r];
                r++;
            }
            k++;
        }
        while (l < first.length) {
            mix[k] = first[l];
            k++;
            l++;
        }
        while (r < second.length) {
            mix[k] = second[r];
            k++;
            r++;
        }
        return mix;
    }

    public static void mergeSortInPlace(int[] arr, int l, int r) {
        if(r - l == 1) return;
        int mid = (l + r) / 2;
        mergeSortInPlace(arr, l, mid);
        mergeSortInPlace(arr, mid, r);

        mergeInPlace(arr, l, mid, r);
    }
    public static void mergeInPlace(int[] arr, int s, int m, int e) {
        int l = s, r = m, k = 0;
        int[] mix = new int[e - s];
        while(l < m && r < e) {
            if(arr[l] < arr[r]) {
                mix[k] = arr[l];
                l++;
            } else {
                mix[k] = arr[r];
                r++;
            }
            k++;
        }
        // it may be possible that one of the arrays is not complete
        // copy the remaining elements
        while (l < m) {
            mix[k] = arr[l];
            k++;
            l++;
        }
        while (r < e) {
            mix[k] = arr[r];
            k++;
            r++;
        }
        for (int i = 0; i < mix.length; i++) {
            arr[s + i] = mix[i];
        }
    }
}
