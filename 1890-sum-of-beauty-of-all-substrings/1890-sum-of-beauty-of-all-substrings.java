class Solution {
    public int beautySum(String s) {
        int totalBeauty = 0;
        for(int i = 0;i<s.length();i++){
            HashMap<Character, Integer> list = new HashMap<>();
            for(int j = i; j<s.length();j++){
                char ch = s.charAt(j);
                list.put(ch, list.getOrDefault(ch, 0)+1);

                int maxFreq = Collections.max(list.values());
                int minFreq = Collections.min(list.values());

                totalBeauty += (maxFreq - minFreq);
            }

        }
        return totalBeauty;
    }
}