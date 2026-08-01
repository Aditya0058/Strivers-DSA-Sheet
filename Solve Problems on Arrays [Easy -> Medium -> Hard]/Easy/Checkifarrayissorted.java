public class Checkifarrayissorted {
    public static boolean check(int[] nums){
        int[] arr = new int[nums.length+1];
        for(int i = 0; i<nums.length;i++){
            arr[i] = nums[i];
        }
        arr[nums.length] = arr[0];
        int count = 0;
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]>arr[i+1]){
                count++;
            }
        }
        if(count>=2){
            return false;
        }   
        return true;
    }
    public static void main(String[] args){
        int[] arr = {3, 4, 1, 2};
        System.out.print(check(arr));
    }
}