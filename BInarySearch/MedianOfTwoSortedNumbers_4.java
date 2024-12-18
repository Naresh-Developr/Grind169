import java.util.Arrays;

public class MedianOfTwoSortedNumbers_4 {
    class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int[] arr = new int[n1 + n2];
        for(int i=0;i<n1;i++){
            arr[i] = nums1[i];
        }
        for(int i=0;i<n2;i++){
            arr[i+n1] = nums2[i];
        }
        Arrays.sort(arr);

        if(arr.length % 2 == 0){
            return (double) (arr[(arr.length/2)-1] + arr[(arr.length/2)])/2;
        }
        
        return (double) arr[arr.length/2];
        
        


    }
}
}
