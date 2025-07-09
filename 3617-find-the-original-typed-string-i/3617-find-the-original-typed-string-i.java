class Solution {
    public int possibleStringCount(String word) {
        int n = word.length();
    int total = 1; // Original string is always valid
    int i = 0;

    List<Integer> shrinkOptions = new ArrayList<>();

    while (i < n) {
        int j = i;
        while (j < n && word.charAt(j) == word.charAt(i)) {
            j++;
        }
        int len = j - i;
        if (len > 1) {
            shrinkOptions.add(len - 1); // possible shorter versions
        }
        i = j;
    }

    // We can apply shrink to only one group
    for (int options : shrinkOptions) {
        total += options;
    }

    return total;
    }
}