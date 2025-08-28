class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, new ArrayList<>(), result, new boolean[nums.length]);
        return result;
    }
    public void backtrack(int[] nums, List<Integer> temp, List<List<Integer>> result, boolean[] used){
        if(temp.size() == nums.length && !result.contains(temp)){
            result.add(new ArrayList<>(temp));
            return;
        }

        for(int i = 0;i<nums.length;i++){
            if(used[i]) continue;

            used[i] = true;
            temp.add(nums[i]);

            backtrack(nums, temp, result, used);
            used[i] = false;
            temp.remove(temp.size()-1);
        }
    }
}