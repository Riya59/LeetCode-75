class Solution {
    public String removeStars(String s) {
        Stack<Character>st = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for(char c : s.toCharArray()){
            if(c == '*'){
                st.pop();
            }
            else{
                st.push(c);
            }
        }

        while(!st.isEmpty()){
            sb.append(st.pop());
        }

        return sb.reverse().toString();
    }
}
