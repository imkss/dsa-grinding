package sorting;

public class B_Bubble_Sort {
    public static void main(String[] args) {

        int[] arr = {13,46,24,52,20,9};

        System.out.println("Before Sorting");
        for(int num: arr){
            System.out.print(num +" ");
        }
        System.out.println();
        System.out.println("______________");

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("After Bubble Sorting");
        for(int num: arr){
            System.out.print(num +" ");
        }
    }
}
