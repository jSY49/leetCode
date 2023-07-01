class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        
        var dup = 1
        var cnt = 1 

        for(i in 1 until nums.size){
            if(nums[i]== nums[i-1]){
                dup++
            }else{
                dup=1
            }

            if(dup<=2){
                nums[cnt++]=nums[i]
            }
        }

        return cnt
    }
}