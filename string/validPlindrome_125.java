class Solution {
    public boolean isPalindrome(String s) {
        int l = 0;
        int r = s.length()-1;

        while(l < r){
            if(!Character.isLetterOrDigit(s.charAt(l))){
                l=l+1;
            }
            else if(!Character.isLetterOrDigit(s.charAt(r))){
                r=r-1;
            }
            else if(Character.toLowerCase(s.charAt(l)) == Character.toLowerCase(s.charAt(r))){
                l+=1;
                r-=1;
            }
            else{
                return false;
            }
        }

        return true;

    }
}