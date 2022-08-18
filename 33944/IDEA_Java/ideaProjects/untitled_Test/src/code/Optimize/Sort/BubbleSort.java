package code.Optimize.Sort;

public class BubbleSort {
    public static void main(int[] arr) {
        for(int i = arr.length - 1; i > 0; i--){
            for(int j = 0; j < i; j++){
                if(arr[j] < arr[j + 1]){
                    swap(arr, arr[j], arr[j + 1]);
                }
            }
        }
    }
    public static void swap(int[] arr, int i, int j){
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];
    }
}
