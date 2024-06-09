class Solution {
    public String convertToTitle(int columnNumber) {
        //ascii  A : 65
        //1~26 : A~Z 
        
        String ans = "";
        while (columnNumber > 0)
        {
            columnNumber--;
            ans = (char)('A' + columnNumber % 26)+ans;
            columnNumber = columnNumber / 26;
        }
        return ans;
        
        
        
    }
}