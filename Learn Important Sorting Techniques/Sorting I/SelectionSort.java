class SelectionSort{
    public static void main(String[] args) {
        int[] arr = {3, 41, 40, 12, 9};
        for(int i = 0; i< arr.length-1; i++){
            int min = i;
            for(int k = i; k <= arr.length-1; k++){
                if(arr[min]>arr[k]){
                    min = k;
                }
            }
            //swap
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;

        }
        //print array
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }
}