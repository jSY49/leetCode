class Solution {
    fun trailingZeroes(n: Int): Int {
        //trailing zero : 소수점 오른쪽에 있으면서 그 뒤에 숫자가 오지않는 0
        //예 : 12200 에서 마지막00 , 13003000에서 000만 
        //규칙 : n!에서 n을 5로 나누었을때 몫의 합 = tracing zero의 개수 
        var cnt =0 
        var res = n
        
        while(res>0){
            res/=5
            cnt+=res
        }
        
        return cnt
    }
}