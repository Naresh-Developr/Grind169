public class missingNumber_268 {
    class Solution {
        public int missingNumber(int[] nums) {
            int tot=0,fin=0;
            int n = nums.length;
            for(int i=0;i<n;i++){
                tot += nums[i];
            }
            fin = (n*(n+1))/2;
            return fin-tot;
            
        }
    }
}
