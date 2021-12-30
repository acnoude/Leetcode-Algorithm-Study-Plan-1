package Day1;
// Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.

// You must write an algorithm with O(log n) runtime complexity.
class Solution {
    public int search(int[] nums, int target) {
        
        int l=0,h=nums.length-1;
//        int m = (l+h)/2;
        return search(nums,target,l,h);
    }

    private int search(int[] nums, int target, int l, int h) {
           int m ;
        while(l<=h){
           m = (l+h)/2;
            if(m==target){
                return m;
            }else if(nums[m]<target){
                l=m+1;
            }else{
                h=m;
            }
        }

        return -1;
        
    }

    public static void main(String[] args) {
        int[] nums ={-1,0,3,5,9,12};
        Solution s = new Solution();
        s.search(nums, 9);
    }
    
    
}