class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (isOpenBracket(c)) {
                st.push(c);
            } else {
                if (st.isEmpty()) {
                    return false;
                } else {
                    if (st.pop() != getOpenBracketForClose(c)) {
                        return false;
                    }
                }
            }
        }
        if (st.isEmpty()) {
            return true;
        }
        return false;
    }

    private boolean isOpenBracket(char ch) {
        return ch == '(' || ch == '{' || ch == '[';
    }

    private char getOpenBracketForClose(char ch) {
        char result;
        switch(ch) {
            case ')':
                result = '(';
                break;
            case '}':
                result = '{';
                break;
            default:
                result = '[';
        }
        return result;
    }
}
