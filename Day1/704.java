package Day1;
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