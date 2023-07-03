class Solution {
    public boolean buddyStrings(String s, String goal) {
        //s에 있는 두개의 알파벳 위치를 바꾸었을 때 goal과 같아질 수 있는지?
        if(s.length() != goal.length()) return false;   //길이가 다르면 
        //이미 같으면. aa = true vs  abc = false 
        if(s.equals(goal))  {
            Set<Character> set = new HashSet<>(); //중복이 없는 set으로 겹치는 글자가 있으면 true
            for (char c : s.toCharArray())
                set.add(c);
            return set.size()<s.length();
            
        }   
        

        ArrayList<Integer> res = new ArrayList<Integer>();
        for(int i=0; i<s.length();i++){
            if(s.charAt(i)!=goal.charAt(i)){
                res.add(i);
            }
            
            if(res.size()>2){
                return false;
            }
        }        
        
        if(res.size()==2){
            if(s.charAt(res.get(0))==goal.charAt(res.get(1)) && s.charAt(res.get(1))==goal.charAt(res.get(0)))  return true;
        }
        
        return false;
        
    }
}