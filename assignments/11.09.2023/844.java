class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st1 = new Stack<>();
        Stack<Character> st2 =new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='#'){
                if(!st1.isEmpty()){
                    st1.pop();
                }
            }
            else{
                st1.push(ch);
            }
        }
        for(int j=0;j<t.length();j++){
            char ch = t.charAt(j);
            if(ch=='#'){
                if(!st2.isEmpty()){
                    st2.pop();
                }
            }
            else{
                st2.push(ch);
            }
        }
        while(!st1.isEmpty() && !st2.isEmpty()){
            if(st1.pop()!=st2.pop()){
                return false;
            }
        }
        return st1.isEmpty() && st2.isEmpty();
        
    }
}