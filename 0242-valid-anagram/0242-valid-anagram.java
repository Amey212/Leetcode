class Solution {
    public boolean isAnagram(String s, String t) {
        char arr[] = s.toCharArray();
        char nums[] = t.toCharArray();
        if(nums.length!=arr.length){
            return false;
        }
        Arrays.sort(arr);
        Arrays.sort(nums);

        for(int i = 0;i<arr.length;i++){
            if(arr[i]!=nums[i]){
                return false;
            }
        }
        return true;

    }
}