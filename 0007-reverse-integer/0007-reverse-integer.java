class Solution {
    public int reverse(int x) {
       
        int res = 0;
        
        while(x!=0){
            int tmp= res*10+x%10;
            //지금까지의 res값과 새로운 tmp/10의 값이 다르면 overFlow 
            //예를 들어 res= 96 , tmp = 964 일때, tmp/10과 res의 값은 같아야 함 
            if(tmp/10 != res)    return 0;
            res = tmp;
            x/=10;
        }
            
        return res;
    }
}

