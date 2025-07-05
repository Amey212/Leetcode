class Solution {
    public int findLucky(int[] arr) {
        int maxi = -1;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0;i<arr.length;i++){
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getKey()==entry.getValue()){
                maxi = Math.max(entry.getValue(), maxi);
            }
        }
        return maxi;
    }
}