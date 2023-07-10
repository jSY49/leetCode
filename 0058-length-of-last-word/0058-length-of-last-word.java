import java.util.*;

class Solution {
    public int lengthOfLastWord(String s) {
        
        StringTokenizer st = new StringTokenizer(s," ");
        String tmp="";
        
        while(st.hasMoreTokens()){
            tmp = st.nextToken();
        }
        
        
        return tmp.length();
    }
}