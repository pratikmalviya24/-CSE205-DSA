class Solution {
    public String removeStars(String s) {
        StringBuilder ans = new StringBuilder();
        Stack<Character> stack = new Stack<Character>();
        for(char item : s.toCharArray()){
            if(!stack.empty() && item=='*'){
                stack.pop();
            }
            else{
                stack.push(item);
            }
        }
        while(!stack.isEmpty()){
            ans.append(stack.pop());
        }
        return ans.reverse().toString();
    }
}