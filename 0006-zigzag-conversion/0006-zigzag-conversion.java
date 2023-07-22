class Solution {
    public String convert(String s, int numRows) {
      
        if(numRows<=1) return s;
        
        StringBuilder[] sb = new StringBuilder[numRows];
        for(int i=0; i<numRows;i++) sb[i] = new StringBuilder();
        
        int idx =0, dir=-1; 
        for(char ch : s.toCharArray()){
            sb[idx].append(ch);
            if(idx ==0 || idx == numRows-1) dir = 0- dir;
            idx+=dir;
        }
        
        StringBuilder ans = new StringBuilder();
        for(StringBuilder res : sb)  ans.append(res);
        return ans.toString();
        
    }
}

