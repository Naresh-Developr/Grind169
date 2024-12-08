class Solution {
    public boolean searchMatrix(int[][] arr, int target) {
        int n = arr.length ;
        int m = arr[0].length ;

        int start =0;
        int end = (n*m)-1;

        while(start<=end){
            int mid = (start+end)/2;

            int r = mid/m;
            int c = mid%m;

            if(arr[r][c] == target) return true;
            if(arr[r][c] < target){ 
                start = mid+1;
            }
            else{
                end = mid-1;
            } 
        }

        
        
        return false;
    }
}