class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
         int m = nums1.length;
         int n = nums2.length;

         int[] result = new int[m+n];
         for(int i = 0;i<m;i++){
            result[i]=nums1[i];
         }
         for(int i = 0;i<n;i++){
            result[m+i]= nums2[i];
         }
         Arrays.sort(result);
         int length= result.length;

         int mid = length/2;
         if(length%2 !=0){
             return result[mid];
         }
         return (result[mid-1] +result[mid])/2.0;
    }
}