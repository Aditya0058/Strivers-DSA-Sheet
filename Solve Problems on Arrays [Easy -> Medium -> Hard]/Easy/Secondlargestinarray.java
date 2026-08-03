public class Secondlargestinarray {
    public static void main(String[] args){
        int[] arr = {2, 5, 1, 3, 6};
        int largest =0;
        for(int i = 0 ; i<arr.length; i++){
            if (arr[i]>largest){
                largest = arr[i];
            }
        }
        int secLargest = 0;
        for(int i = 0; i<arr.length; i ++){
            if(arr[i]>secLargest && arr[i]!= largest){
                secLargest = arr[i];
            }
        }
        System.out.println(largest);
        System.out.println(secLargest);
    }

}
