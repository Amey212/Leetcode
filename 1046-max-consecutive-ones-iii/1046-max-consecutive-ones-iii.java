class Solution {
    public int longestOnes(int[] nums, int k) {
        int maxlen = 0;
        int len = 0;
        int l = 0;
        int r = 0;
        int zero = 0;
        int n = nums.length;

        while(r<n){
            if(nums[r] == 0){
                zero++;
            }

            while(zero>k){
                if(nums[l] == 0){
                    zero--;
                }
                l++;
                
            }

            maxlen = Math.max(maxlen, r - l + 1);
            r++;
        }
        return maxlen;
    }
}