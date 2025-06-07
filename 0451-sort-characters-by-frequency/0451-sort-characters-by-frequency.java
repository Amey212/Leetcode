import java.util.*;

class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((a, b) -> b.getValue() - a.getValue()); // Sorting by frequency in descending order

        StringBuilder result = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : list) {
            char ch = entry.getKey();
            int freq = entry.getValue();
            result.append(String.valueOf(ch).repeat(freq)); // Appending characters based on frequency
        }

        return result.toString();
    }
}
