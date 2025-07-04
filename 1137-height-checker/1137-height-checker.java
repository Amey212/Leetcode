class Solution {
    public int heightChecker(int[] heights) {
        int cnt = 0;
        int[] arr = Arrays.copyOf(heights, heights.length);
        Arrays.sort(arr);
        for(int i = 0;i<heights.length;i++){
            if(heights[i]!=arr[i]){
                cnt++;
            }
        }
        return cnt;
    }
}