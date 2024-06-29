
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        if (s.length() == 0) {return false;}

        int end = 0;
        String temp = "";
        for(int i = 0; i < s.length(); i++){
            temp += s.charAt(i);
            if(wordDict.contains(temp)){
                //now is contain
                end = i;
                temp = "";
            }
        }
        if(end == s.length() - 1 && temp.equals("")){return true;}
        return false;
    }
}

import java.util.*;

class Solution2 {
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> wordSet = new HashSet<>(wordDict);
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true; // Base case: empty string can be segmented

        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && wordSet.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break; // No need to check further once we found a valid segmentation
                }
            }
        }

        return dp[s.length()];
    }
}
