class Solution {
    public int subarraySum(int[] nums, int k) {
     
        int cnt = 0;

        for (int i = 0; i < nums.length; i++) {
            int sum = 0;

            // Calculate sum for every subarray starting at index 'i'
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if (sum == k) {
                    cnt++;
                }
            }
        }
        return cnt;
    }
}