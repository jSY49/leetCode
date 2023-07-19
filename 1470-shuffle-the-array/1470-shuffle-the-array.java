class Solution {
    public int[] shuffle(int[] nums, int n) {
        int len = nums.length;
        int[] ans = new int[len];
        
        int[] x = Arrays.copyOfRange(nums, 0, n);
        int[] y = Arrays.copyOfRange(nums, n, len);
        
        System.out.println(x.length);
        System.out.println(y.length);
        
        
        int j=0;
        for(int i =0 ; i<len;i+=2){
            ans[i] = x[j];
            ans[i+1] = y[j++];
        }
        
        return ans;
    }
}