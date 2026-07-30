import java.util.*;

public class MergeSort{

    public static void mergeSort( ArrayList<Integer> arr,  int start, int end){
        int mid = (start + end)/2;
        
        if(start < end){ 
            mergeSort(arr, start, mid); // left part
        mergeSort(arr, mid+1, end); // right part

        merge(arr, start, mid, end);
        }
    }

    // merge function
    public static void merge(ArrayList<Integer> arr, int start, int mid, int end){
        int i = start;
        int j = mid + 1;
        ArrayList<Integer> temp = new ArrayList<>();
        while (i<= mid && j <= end) {
            if(arr.get(i)>=arr.get(j)){
                temp.add(arr.get(j));
                j++;
            }else {
                temp.add(arr.get(i));
                i++;
            }
        }
        while(i<=mid){
            temp.add(arr.get(i));
            i++;
        }
        while(j<= end){
            temp.add(arr.get(j));
            j++;
        }
        int t = 0;
        for(int m = start; m<=end; m++){
            arr.set(m, temp.get(t));
            t++;
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(3, 1, 23, 5, 2));
        mergeSort(arr, 0, arr.size()-1);
        System.out.println(arr);
    }
}