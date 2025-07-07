class Solution {
    public int maxEvents(int[][] events) {
        Arrays.sort(events, (a, b) -> Integer.compare(a[0], b[0])); // Sort by start day

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        int i = 0, n = events.length, day = 1, maxDay = 100000, count = 0;

        while (day <= maxDay) {
            // Add events that start today
            while (i < n && events[i][0] == day) {
                minHeap.offer(events[i][1]); // Add end day to minHeap
                i++;
            }

            // Remove expired events
            while (!minHeap.isEmpty() && minHeap.peek() < day) {
                minHeap.poll();
            }

            // Attend one event today
            if (!minHeap.isEmpty()) {
                minHeap.poll(); // Attend the event with the earliest end
                count++;
            }

            // Early exit: if no events left to process and heap is empty
            if (i == n && minHeap.isEmpty()) break;

            day++;
        }

        return count;
    }
}