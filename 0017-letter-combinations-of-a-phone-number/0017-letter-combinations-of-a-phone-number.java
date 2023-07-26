class Solution {
    
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<String>();    
        if(digits.isBlank())  return res;
        String[] mapping = new String[] {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        
        res.add("");
        
        for(int i =0; i< digits.length();i++){  
            res = combine(mapping[digits.charAt(i)-'0'],res); 
        }
        return res;    
    }
    
    public static List<String> combine(String digit, List<String> l) {
            List<String> result = new ArrayList<String>();
            for (int i=0; i<digit.length(); i++) 
                for (String x : l) 
                    result.add(x+digit.charAt(i));
            // System.out.println(result.toString());
            return result;
    }
}
    

         
        
        