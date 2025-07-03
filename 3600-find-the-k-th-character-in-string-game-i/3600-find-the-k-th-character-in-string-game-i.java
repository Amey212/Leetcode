class Solution {
    public char kthCharacter(int k) {
        StringBuilder word = new StringBuilder("a");

        while (word.length() < k) {
            int len = word.length();
            for (int i = 0; i < len; i++) {
                char nextChar = (char)((word.charAt(i) - 'a' + 1) % 26 + 'a');
                word.append(nextChar);
            }
        }

        return word.charAt(k - 1);
    }
}