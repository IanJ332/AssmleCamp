class Solution {
    public boolean CheckPal(String s){
        int l = 0;
        int r = s.length() - 1;
        while(l < r)
        {
            if(s.charAt(l) != s.charAt(r))
            {
                return false;
            }
            l++;
            r--; 
        }
        return true;
    }
    public int countSubstrings(String s) {
        int k = 0;
        int len = s.length();
        for(int i = 0; i < len; i++)
        {
            String newStr = "";
            for(int j = i; j < len; j++)
            {
                newStr += (s.charAt(j) + "");
                if(CheckPal(newStr)){
                    k++;
                }
            }
        }
        return k;
    }
}