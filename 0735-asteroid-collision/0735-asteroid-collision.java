class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        
        Stack<Integer> st = new Stack<>();
        
        for(int ast :asteroids){
            boolean flag = true;
            while(!st.isEmpty() && st.peek()> 0 && ast<0){ //서로 마주보고 올때 
                if(Math.abs(st.peek())<Math.abs(ast)){
                    st.pop();
                    continue; //크기가 작은 기존 행성 계속 파괴 
                }else if(Math.abs(st.peek())==Math.abs(ast)){
                    st.pop();   //크기 같으면 둘다 파괴
                }
                
                flag = false;   //파괴 되었음을 의미 
                break;   
            }
           
            if(flag)    st. push(ast); // 파괴 안되었으면 push
            
        }
        
        int[] ans = new int[st.size()];
        for(int i=st.size()-1 ; i>=0 ; i--){
            ans[i] = st.pop();
        }
        
        return ans;
    }
}