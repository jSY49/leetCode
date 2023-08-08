class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double ans =0.0;
        int len = nums1.length + nums2.length;
        int[] newArray = new int[len];
        System.arraycopy(nums1, 0, newArray, 0, nums1.length);
        System.arraycopy(nums2, 0, newArray, nums1.length, nums2.length);
        
        Arrays.sort(newArray);
        System.out.println(Arrays.toString(newArray));
        
        if(len%2!=0) ans=newArray[len/2];
        else{
            ans =  (double)(newArray[len/2]+newArray[len/2-1])/2;  
        }
        
        return ans;
    }
}