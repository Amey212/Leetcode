class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int maxlen = 0;
        int left = 0;
        

        for(int right =0;right<s.length();right++){
            if(!set.contains(s.charAt(right))){
                set.add(s.charAt(right));
                maxlen = Math.max(maxlen, right-left+1);
            }
            else{
                while(s.charAt(left)!=s.charAt(right)){
                    set.remove(s.charAt(left));
                    left++;
                }
                set.remove(s.charAt(right));
                left++;
                set.add(s.charAt(right));
            }
        }
        return maxlen;
    }
}