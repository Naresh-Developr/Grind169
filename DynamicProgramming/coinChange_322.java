import java.util.Arrays;

public class coinChange_322 {
    class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount+1];
        Arrays.fill(dp,amount+1);
        dp[0] = 0;

        for(int i=1;i<=amount;i++){
            for(int coin:coins){
                if(i-coin>=0){
                    dp[i] = Math.min(dp[i],dp[i-coin]+1);
                }
            }
        }
        if(dp[amount]>amount){
            return -1;
        }
        return dp[amount];
    }
}
}
