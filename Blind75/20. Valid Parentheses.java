public class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');

        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (map.containsKey(c)) {
                if (stack.isEmpty() || stack.pop() != map.get(c)) {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }

        return stack.isEmpty();
    }
}

public class Solution2 {
    public boolean isValid(String s) {
        int pointer = 0;
        while(pointer < s.length()){
            if(s.charAt(pointer) == '('){
                if(pointer + 1 < s.length() && isParentheses(s, pointer + 1)){
                    pointer += 2;
                }else{
                    return false;
                }
            }

            if(pointer < s.length() && s.charAt(pointer) == '{'){
                if(pointer + 1 < s.length() && isBraces(s, pointer + 1)){
                    pointer += 2;
                }else{
                    return false;
                }
            }  
            if(pointer < s.length() && s.charAt(pointer) == '['){
                if(pointer + 1 < s.length() && isBrackets(s, pointer + 1)){
                    pointer += 2;
                }else{
                    return false;
                }
            }                      
        }
        return true;
    }
    private boolean isParentheses(String s, int i){
        if(s.charAt(i) == ')'){
            return true;
        }
        return false;
    }
    private boolean isBraces(String s, int i){
        if(s.charAt(i) == '}'){
            return true;
        }
        return false;
    }
    private boolean isBrackets(String s, int i){
        if(s.charAt(i) == ']'){
            return true;
        }
        return false;
    }
}
