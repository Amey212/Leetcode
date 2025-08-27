class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, new ArrayList<>(), result);
        return result;
    }
    private void backtrack(int[] nums, ArrayList<Integer> temp, List<List<Integer>> result){
        for(int num  : nums){
            
            if(temp.size() == nums.length){
                result.add(new ArrayList<>(temp));
                return;
            }

            if(temp.contains(num))continue;

            temp.add(num);

            backtrack(nums, temp, result);

            temp.remove(temp.size()-1);
        }
    }
}