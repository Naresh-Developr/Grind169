package week_3;

import java.util.HashMap;

public class LongestSubStringWithoutReapeating_3 {
    class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> mpp = new HashMap<>();

        int left=0,right=0;
        int n = s.length();
        int ansLen = 0;

        while(right<n){
            if(mpp.containsKey(s.charAt(right))){
                left = Math.max(mpp.get(s.charAt(right))+1, left);
            }
            mpp.put(s.charAt(right),right);
            ansLen = Math.max(ansLen, right-left+1);
            right++;
        }
        return ansLen;
    }
}
    
}
