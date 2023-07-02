class Solution {
    fun trailingZeroes(n: Int): Int {
        
        var cnt =0 
        var res = n
        
        while(res>0){
            res/=5
            cnt+=res
        }
        
        return cnt
    }
}