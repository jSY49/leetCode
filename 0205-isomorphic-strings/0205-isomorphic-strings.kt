class Solution {
    fun isIsomorphic(s: String, t: String): Boolean {
        var m = mutableMapOf<Char,Char>()
        
        m.put(s[0],t[0])
        
        for(i in 1 until t.length){
            if(m.containsKey(s[i])){
                if(m[s[i]]!=t[i]){
                    return false
                }
            }else{
                if(m.containsValue(t[i]))   return false
                else    m.put(s[i],t[i])
            }
        }
        
        return true
    }
}