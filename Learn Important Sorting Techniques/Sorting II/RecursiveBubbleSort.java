public class RecursiveBubbleSort {
    public static void bubbleSort(int[] arr, int len){
        if(len == 1){
            return;
        }
        for (int i = 0; i < len-1; i++) {
            if(arr[i]>arr[i+1]){
                //swap
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;

            }
        }
        bubbleSort(arr, len-1);
        
    }
    public static void main(String[] args) {
        int[] arr = { 9, 3, 7, 4, 2, 1 };
        int len = 6;
        bubbleSort(arr, len);
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}
