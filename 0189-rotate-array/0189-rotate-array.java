class Solution {
    public void rotate(int[] nums, int k) {
        
        
        
        if(k <=0)  return;
        
        k %=nums.length;
        
        int len = nums.length;
        int[] nums2 = Arrays.copyOf(nums,len);
        for (int i = 0; i < len; i++) {
            if(i<k){
                nums[i] = nums2[len-k+i];
            }else{
                nums[i] = nums2[i-k];
        }
        }
    }
}