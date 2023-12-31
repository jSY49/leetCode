class Solution {
    public int removeDuplicates(int[] nums) {
        
        int n = nums.length;
        if(n <= 1 ) return n;
        
        int left = 0;
        int right =1;
        
        while(right<=n-1){
            
            if(nums[left]==nums[right]){
                right++;
            }else{
                nums[left+1] = nums[right];
                left++;
                right++;
            }
            
        }
        
            
        return left+1;
    
    }
}
 
