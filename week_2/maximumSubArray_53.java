class Solution {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        int n = nums.length;
        for(int i=0;i<n;i++){
            sum = Math.max(nums[i]+sum,nums[i]);
            max = Math.max(sum,max);
        }
        return max;
    }
}