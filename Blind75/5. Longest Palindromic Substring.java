class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }
        
        int maxLen = 1;
        String longestPal = s.substring(0, 1);

        for (int i = 0; i < s.length(); i++) {
            for (int j = s.length() - 1; j > i; j--) {
                if (s.charAt(i) == s.charAt(j)) {
                    int left = i;
                    int right = j;
                    boolean isPalindrome = true;

                    while (left < right) {
                        if (s.charAt(left) != s.charAt(right)) {
                            isPalindrome = false;
                            break;
                        }
                        left++;
                        right--;
                    }

                    if (isPalindrome) {
                        int tempLen = j - i + 1;
                        if (tempLen > maxLen) {
                            maxLen = tempLen;
                            longestPal = s.substring(i, j + 1);
                        }
                    }
                }
            }
        }
        
        return longestPal;
    }
}
