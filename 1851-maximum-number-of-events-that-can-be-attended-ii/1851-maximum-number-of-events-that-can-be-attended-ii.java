class Solution {
    public int maxValue(int[][] events, int k) {
        Arrays.sort(events, Comparator.comparingInt(a -> a[0]));
        int n = events.length;

        // Extract start days for binary search
        int[] starts = new int[n];
        for (int i = 0; i < n; i++) {
            starts[i] = events[i][0];
        }

        // Memoization cache: dp[i][k]
        Integer[][] memo = new Integer[n][k + 1];

        return dfs(events, starts, 0, k, memo);
    }

    private int dfs(int[][] events, int[] starts, int i, int rem, Integer[][] memo) {
        if (i >= events.length || rem == 0) return 0;
        if (memo[i][rem] != null) return memo[i][rem];

        // Option 1: skip current event
        int skip = dfs(events, starts, i + 1, rem, memo);

        // Option 2: attend current event
        int next = findNext(events, starts, events[i][1]);
        int take = events[i][2] + dfs(events, starts, next, rem - 1, memo);

        return memo[i][rem] = Math.max(skip, take);
    }

    // Binary search for next non-overlapping event
    private int findNext(int[][] events, int[] starts, int currEnd) {
        int low = 0, high = starts.length;
        while (low < high) {
            int mid = (low + high) / 2;
            if (starts[mid] > currEnd) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
    
}