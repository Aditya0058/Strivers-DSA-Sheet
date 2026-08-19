public class LeftRotateArrayByKElement {
    public static void reverse(int start, int end, int[] arr){
        while( start < end ){
            //swap
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        int k = 2;
        int i = k%n;
        //reverse first i elements
        reverse(0, i-1, arr);
        reverse(i, n-1, arr);
        reverse(0, n-1, arr);
        //print arr
        for(int j : arr ){
            System.out.print(j);
        }

    }
}
