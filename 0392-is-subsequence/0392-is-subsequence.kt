class Solution {
    fun isSubsequence(s: String, t: String): Boolean {
        var start =0 
        var res = false 
        
        if(s.length == 0 )  return true
        
        s.forEach{
            res = false 
            loop@for(i in start until t.length){
                if(it == t[i]) {
                    start = i+1
                    res = true
                    break@loop
        
                }else{
                    res = false
                }
            }
            if(!res) return res
        }
        
        return res
    }
}