class Solution {
    public int[] buildArray(int[] nums) {
        int[] res = new int[nums.length];
        int idx=0;
        for(int n : nums){
            res[idx] = nums[nums[idx++]];
        }
        return res;
    }
}