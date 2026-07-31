public class RecursiveAssertionSort {
    public static void selectionSort(int[] arr, int digit, int len){
        if(digit > len-1){
            return;
        }
            while(digit>0 && arr[digit-1]>arr[digit]){
            // swap
            int temp = arr[digit-1];
            arr[digit-1] = arr[digit];
            arr[digit] = temp;
            digit--;

        }
        selectionSort(arr, digit+1, len);
        return;
    }
    public static void main(String[] args){
        int[] arr = {9, 6, 2, 8, 3};
        int len = 5;
        selectionSort(arr, 1, len);
        for(int l: arr){
            System.out.print(l + " ");
        }
    }
}
