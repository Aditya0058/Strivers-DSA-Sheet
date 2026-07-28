class BubbleSort{
    public static void main(String[] args){
        int[] arr = {23, 5, 12, 3, 19};
        for(int i = 0; i<arr.length-1; i++){
            int didSwap = 0;
            for(int j = 0; j<arr.length-i-1; j++){
                
                //compare
                if(arr[j]>arr[j+1]){
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    didSwap = 1;
                }

            }
            if(didSwap == 0){
                break;
            }
        }
        //print array
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}