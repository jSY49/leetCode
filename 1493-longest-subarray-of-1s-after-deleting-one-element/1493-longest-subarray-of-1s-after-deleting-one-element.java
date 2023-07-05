class Solution {
    public int longestSubarray(int[] nums) {
        int one =0, preOne =0 ,max=0;
        
        for(int i : nums){
            if(i==0){
                max = Math.max(max,preOne+one);
                preOne = one;
                one=0;
            }else{
                one++;
            }
        }
   
        max = Math.max(max,preOne+one);
        return max==nums.length? nums.length-1:max;
    }
}