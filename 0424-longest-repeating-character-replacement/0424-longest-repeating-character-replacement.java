class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> set = new HashMap<>();

        int left = 0;
        int freq = 0;
        int maxlen = 0;

        for(int right = 0;right<s.length();right++){
            char rightChar = s.charAt(right);
            set.put(rightChar, set.getOrDefault(rightChar, 0)+1);
            freq = Math.max(freq, set.get(rightChar));

            while((right-left + 1)- freq > k){
                char leftChar = s.charAt(left); 
                set.put(leftChar, set.getOrDefault(leftChar, 0) - 1);
                left++;
            }
            maxlen = Math.max(maxlen, right-left+1);
        }
        return maxlen;
    }
}