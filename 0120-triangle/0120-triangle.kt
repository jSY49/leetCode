class Solution {
    fun minimumTotal(triangle: List<List<Int>>): Int {
        var dp : Array<Int> = emptyArray()
        var s = triangle.size   //4
        
        for(i in 0 until s){
            dp= dp.plus(triangle[s-1][i])
        }
        
        for(i in s-2 downTo 0){
            for(j in 0 .. triangle[i].size-1){
                dp[j]= triangle[i][j]+Math.min(dp[j],dp[j+1])
                
            }
        }
        
        // print(Arrays.toString(dp))
        return dp[0]
    }
}