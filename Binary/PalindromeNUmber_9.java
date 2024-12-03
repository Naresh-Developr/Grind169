public class PalindromeNUmber_9 {
    class Solution {
        public boolean isPalindrome(int x) {
            int INT_MAX = Integer.MAX_VALUE;
            int y=0;
            int temp = x;
            x = Math.abs(x);
            if(x<0)  return false;
            while(x>0){
                int l = x%10;
                y = (y*10) + l;
                x = x/10;
            }
    
            if(y==temp){
                return true;
            }else{
                return false;
            }
            
            
        }
    }
}
