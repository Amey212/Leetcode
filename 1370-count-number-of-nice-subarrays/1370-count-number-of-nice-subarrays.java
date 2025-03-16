class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int count = 0, oddCount = 0, l = 0;
        int result = 0;

        for (int r = 0; r < nums.length; r++) {
            
            if (nums[r] % 2 != 0) {
                oddCount++;
                count = 0; 
            }

        
            while (oddCount == k) {
                if (nums[l] % 2 != 0) {
                    oddCount--; 
                }
                l++;
                count++;
            }
            result += count;
        }

        return result;
    }
}
