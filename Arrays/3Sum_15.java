public class 3Sum_15 {
    class Solution {
        public List<List<Integer>> threeSum(int[] nums) {
            int n = nums.length;
            Arrays.sort(nums);
            List<List<Integer>> result = new ArrayList<>();
            for(int i=0;i<n-2;i++){
                if (i > 0 && nums[i] == nums[i - 1]) {
                    continue;
                }
                int left = i+1;
                int right = n-1;
    
                while(left<right){
                    int sum = nums[i]+nums[left]+nums[right];
                    
    
                    if(sum==0){
                        result.add(Arrays.asList(nums[i],nums[left],nums[right]));
                        left++;
                        right--;
    
                        while(nums[left] == nums[left-1] && left<right){
                            left++;
                        }
                        while(nums[right] == nums[right+1] && right>left){
                            right--;
                        }
                    }
                    else if(sum>0){
                        right--;
                        while(nums[right] == nums[right+1] && right>left){
                            right--;
                        }
                    }
                    else{
                        left++;
                        while(nums[left] == nums[left-1] && left<right){
                            left++;
                        }
                    }
                    
                }
    
            }
            return result;
     
            
        }
    }
}
