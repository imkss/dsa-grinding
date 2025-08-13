package sorting;

public class A_Selection_Sort {
    public static void main(String[] args) {
        int[] arr = {13,46,24,52,20,9};

        System.out.println("Before Sorting");
        for(int num: arr){
            System.out.print(num +" ");
        }
        System.out.println();
        System.out.println("______________");

        for(int i = 0; i < arr.length - 1; i++) {
            int minInd = i;
            for(int j = i + 1; j < arr.length; j++){
                if(arr[j] < arr[minInd]){
                    minInd = j;
                }
                int temp = arr[minInd];
                arr[minInd] = arr[i];
                arr[i] = temp;
            }
        }

        System.out.println("After Selection Sorting");
        for(int num: arr){
            System.out.print(num +" ");
        }
    }
}
