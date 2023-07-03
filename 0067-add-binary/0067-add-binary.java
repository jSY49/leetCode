import java.math.*;

class Solution {
    public String addBinary(String a, String b) {
        
        BigInteger aB = new BigInteger(a,2);
        BigInteger bB = new BigInteger(b,2);
        BigInteger res = aB.add(bB);
        
        return res.toString(2);
        
    }
}