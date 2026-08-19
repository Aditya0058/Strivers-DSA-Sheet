public class MoveZero {
    public static void main(String[] args) {
        
        int[] arr = {0, 1, 0, 3, 12};
        int scan = 0;
        int insert = 0;
        while(scan<arr.length && insert<arr.length){
            if(arr[scan]!=0){
                int temp = arr[insert];
                arr[insert] = arr[scan];
                arr[scan] = temp;
                insert++;
                scan++;
            } else {
                scan++;
            }
        
        }
        for(int j:arr){
            System.out.print(j);
        }
    }
}
