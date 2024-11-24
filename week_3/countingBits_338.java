public class countingBits_338 {
    class Solution {
        public int[] countBits(int n) {
            int[] ans = new int[n+1];
    
            for(int i=0;i<=n;i++){
                ans[i] = ans[i >> 1] + (i & 1);   //formula and using DP for it
            }
            return ans;
        }
    }
}
