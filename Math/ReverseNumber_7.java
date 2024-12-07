class Solution {
    public int reverse(int x) {
        int y = Math.abs(x);
        long ans = 0;
        while(y>0){
            ans = (ans*10) + y%10;
            y=y/10;
        }
        if(ans<Integer.MIN_VALUE || ans>Integer.MAX_VALUE){
            ans = 0;
        }
        return (x<0) ? (int)ans * (-1) : (int)ans;
        
    }
}