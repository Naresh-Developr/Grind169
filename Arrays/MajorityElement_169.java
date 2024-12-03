class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> dict = new HashMap<>();

        for(int i : nums){
            dict.put(i,dict.getOrDefault(i,0)+1);
        }
        
        int max = 0;
        int maxkey = 0;
        for(int i :  dict.keySet()){
            if(dict.get(i)>max){
                max = dict.get(i);
                maxkey = i;
            }
        }

        return maxkey;
    }
}