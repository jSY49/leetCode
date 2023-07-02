class Solution {
    fun minSubArrayLen(target: Int, nums: IntArray): Int {
        
        var res = Int.MAX_VALUE
        var left = 0
        var sum =0 
        
        for(right in nums.indices){
            sum += nums[right]
            while(sum>=target){
                res = Math.min(res, right-left+1)
                sum -=nums[left++]
            }
            
        }
               return if(res==Integer.MAX_VALUE) 0 else res
    } 
}