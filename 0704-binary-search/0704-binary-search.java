class Solution {
    public int search(int[] nums, int target) {
        
        int start =0, end = nums.length-1;
        
        while(start <= end ){    
             int middle = start+(end-start)/2;
            
            if(target == nums[middle])  return middle;
            else if(target < nums[middle])  end = middle-1;
            else   start = middle+1;
            
        }
        
        return -1;
        
    }
}