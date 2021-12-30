package Day1;

// Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

// You must write an algorithm with O(log n) runtime complexity.
public class SearchInsert {
    public int searchInsert(int[] nums, int target) {
        int l=0,h=nums.length-1;
        int m;
        
        while(l<=h){
            m =(l+h)/2;
            if(nums[m]==target){
                return m;
            }else if(m>0 && nums[m-1]<target && nums[m]>target){
                return m ;
            }else if(nums[m]>target){
                h=m-1;
            }else{
                l=m+1;
            }
        }
        
        if(nums[0]>target){
            return 0;
        }else{
            return nums.length;
        }
            
       
    }

    public static void main(String[] args) {
        SearchInsert s= new SearchInsert();
        int[] nums ={1,3,5,6};
        int target = 5;
        s.searchInsert(nums, target);
    }
}
