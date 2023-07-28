class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer>s = new Stack<>();

        for(int asteroid : asteroids){
            if(asteroid > 0){
                s.push(asteroid);
            }
            else{
                while(!s.isEmpty() && s.peek()>0 && s.peek()<Math.abs(asteroid)){
                    s.pop();
                }

                if(s.isEmpty() || s.peek()<0){
                    s.push(asteroid);
                }
                else if(s.peek() == Math.abs(asteroid)){
                    s.pop();
                }
            }
        }

        int [] ans = new int[s.size()];
        for(int i=s.size()-1; i>=0; i--){
            ans[i] = s.pop();
        }

        return ans;
    }
}
