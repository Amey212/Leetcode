class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> nextGreater = new HashMap<>();
        Deque<Integer> stack = new ArrayDeque<>();

        // Traverse nums2 from right to left
        for (int i = nums2.length - 1; i >= 0; i--) {
            int num = nums2[i];
            // Maintain decreasing stack
            while (!stack.isEmpty() && stack.peek() <= num) {
                stack.pop();
            }

            // Stack top is next greater or -1 if empty
            nextGreater.put(num, stack.isEmpty() ? -1 : stack.peek());
            stack.push(num);
        }

        // Prepare result for nums1
        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            result[i] = nextGreater.get(nums1[i]);
        }

        return result;
    }
}