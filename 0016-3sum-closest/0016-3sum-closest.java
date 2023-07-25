class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int minDiff=Integer.MAX_VALUE;
        int closet = 0; 
        
        Arrays.sort(nums);
        
        for(int i=0 ;i<nums.length-2;i++){
            int j = i+1;
            int k = nums.length-1;
            while(j<k){
                int sum = nums[i]+nums[j]+nums[k];    
                if(sum == target)   return target;
                else if(sum < target)   j++;
                else    k--;  
                
                int diff = Math.abs(target-sum);
                if(diff< minDiff){
                    minDiff = diff;
                    closet = sum;
                }
            }
            
        }
        
        return closet;
        
    }
}