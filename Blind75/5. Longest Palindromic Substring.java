class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }
        int n = s.length();
        for(int len = n; len >= 1; len--) {
            for(int i = 0; i <= n - len; i++) {
                if(isPalin(s, i, i + len - 1)){
                    return s.substring(i, i + len);
                }
            }
        }
        return s.substring(0, 1); // return the first character if no palindrome of length > 1 is found
    }
    private boolean isPalin(String s, int left, int right){
        while(left < right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
