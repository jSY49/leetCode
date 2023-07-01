class Solution {
    fun summaryRanges(nums: IntArray): List<String> {
        
        var res : MutableList<String> = mutableListOf()
        
        if(nums.size==0){
            return res
        }
        
        var fir = nums[0]
        var tmp = nums[0]
        
       for(i in 1 until nums.size){
           if(tmp+1!=nums[i]){     //1증가하지 않았을때 
              res.add(if(fir == tmp) "$fir" else "$fir->$tmp")
               fir = nums[i]
           }
           tmp=nums[i]
       }
         res.add(if(fir == tmp) "$fir" else "$fir->$tmp")
        
        return res
    }
}