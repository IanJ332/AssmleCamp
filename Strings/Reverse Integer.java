class Solution {
    public int reverse(int x) {
        int l = 0;
        String num = Integer.toString(x);
        int r = num.length() - 1;
        while(!Character.isDigit(num.charAt(l))){
            l++;
        }

        char[] numChars = num.toCharArray();
        while(l < r){
            char temp = numChars[l];
            numChars[l] = numChars[r];
            numChars[r] = temp;
            l++;
            r--;
        }
        
        num = new String(numChars);
        long reversedNum = Long.parseLong(num);  // use long type

        // Checks if the reversed number exceeds the maximum value of the int type.
        if (reversedNum > Integer.MAX_VALUE || reversedNum < Integer.MIN_VALUE) {
            return 0;  // If exceeded, return 0
        } else {
            return (int) reversedNum;  // If not exceeded, convert to int type and return
        }
    }
}
