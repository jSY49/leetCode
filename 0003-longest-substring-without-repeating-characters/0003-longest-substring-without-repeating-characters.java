class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        if (s.length()==0) return 0;
        
        Set<Character> set = new HashSet<>();
        int max=0, start=0, tmp=0;
        
        while(tmp<s.length()){
            if(set.contains(s.charAt(tmp))){
                set.remove(s.charAt(start++));
            }else{
                set.add(s.charAt(tmp++));
                max= Math.max(max,set.size());
            } 
        }
        return max;
        
    }
}

