class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2*n];
        int i=0;
        
        for(int tmp : nums){
            ans[i]=tmp;
            ans[n+i]=tmp;
            i++;
        }
        
        return ans;
    }
}