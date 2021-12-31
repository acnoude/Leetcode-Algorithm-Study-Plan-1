package Day2;
//Given an array, rotate the array to the right by k steps, where k is non-negative.
public class RotateArray {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
         int[] arr= new int[nums.length];
        for(int i=0;i<n;i++){
            arr[(i+k)%n]=nums[i];
        }
        for (int i = 0; i < n; i++) {
            nums[i] = arr[i];
          
    }
}
}
