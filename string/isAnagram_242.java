import java.util.*;
class Solution {
    public boolean isAnagram(String s, String t) {
        char[] x = s.toCharArray();
        char[] y = t.toCharArray();

        Arrays.sort(x);
        Arrays.sort(y);

        return Arrays.equals(x,y);

        
    }
}