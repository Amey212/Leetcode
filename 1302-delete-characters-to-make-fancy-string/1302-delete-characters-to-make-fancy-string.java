class Solution {
    public String makeFancyString(String s) {
        StringBuilder str = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            int len = str.length();
            
            if (len < 2 || !(str.charAt(len - 1) == s.charAt(i) && str.charAt(len - 2) == s.charAt(i))) {
                str.append(s.charAt(i));
            }
        }
        return str.toString();
    }
}
