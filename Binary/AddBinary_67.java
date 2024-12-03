import java.math.BigInteger;

class Solution {
    public String addBinary(String x, String y) {
        BigInteger a = new BigInteger(x, 2); 
        BigInteger b = new BigInteger(y, 2);

        BigInteger sum = a.add(b);

        return sum.toString(2); 
    }
}