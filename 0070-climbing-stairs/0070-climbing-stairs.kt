class Solution {
    fun climbStairs(n: Int): Int {
        var dp = Array(n+1){0}
        
        if(n<3) return n
        dp[0]=0
        dp[1]=1
        dp[2]=2
        
        for(i in 3 .. n){
            dp[i]=(dp[i-1]+dp[i-2])
        }
    
        return dp[n]
    }
}