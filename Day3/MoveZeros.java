package Day3;

//Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
public class MoveZeros {
    public void moveZeroes(int[] arr) {
        int count=0;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[count++]=arr[i];
            }
        }
        
        while(count<arr.length){
            arr[count++]=0;
        }
    }
}
