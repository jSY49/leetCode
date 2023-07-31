class Solution {
    public boolean isAnagram(String s, String t) {
        int[] alpha = new int[26];
        
        for(char tmp : s.toCharArray())   alpha[tmp-'a']++;
        for(char tmp : t.toCharArray())   alpha[tmp-'a']--;

        for(int n : alpha){
            if(n!=0) return false;
        }
        return true;
       
    }
}