class Solution {
    public String largestOddNumber(String num) {
        String str = "";
        for (int i = num.length() - 1; i >= 0; i--) {
            int value = num.charAt(i) - '0';
            if (value % 2 != 0) {
                str = num.substring(0, i + 1);
                break;
            }
        }
        return str;
    }
}
