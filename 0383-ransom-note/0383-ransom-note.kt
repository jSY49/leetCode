class Solution {
    fun canConstruct(r: String, m: String) :Boolean{
        
    var a= IntArray(26).apply {
        m.forEach { this[it - 'a']++ }
        r.forEach { if (this[it - 'a'] == 0) return false else this[it - 'a']-- }
    }.isNotEmpty()
        
        
        return a 
    }
}

