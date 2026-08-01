import java.util.Arrays;

public class QuickSort {
    public static int[] sort(int[] arr, int start, int end){
        if(start >= end){
            return arr;
        }
        int pviot = end;
        int i = start-1;
        for(int j = start; j<pviot; j++){
            if(arr[j]<arr[pviot]){
                i++;
                //swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // swap btw pviot and boundary
        i++;
        int temp = arr[i];
        arr[i] = arr[pviot];
        arr[pviot] = temp;

        //left part
        sort(arr, start, i-1);
        //right part
        sort(arr, i+1, end);
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {7, 3, 9, 1, 6, 2};
        int[] result = sort(arr, 0, arr.length-1);
        for(int i = 0; i<result.length; i++){
            System.out.print(result[i] + " ");
        }
    }
}
