class Solution {
    public int alternateDigitSum(int n) {
        int sum = 0;
        int sign = 1;
        for(char s : String.valueOf(n).toCharArray()){
            int dig= s-'0';
            sum += dig*sign;
            sign *= -1; 
        }
        return sum;
    }
}