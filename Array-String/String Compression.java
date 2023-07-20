import java.util.*;
class Solution {
    public int compress(char[] chars) {
        int n = chars.length;
        StringBuilder ans = new StringBuilder("");

        for(int i=0; i<n; i++){
            ans.append(chars[i]);
            int count = 1;

            while(i<n-1){
                if(chars[i] == chars[i+1]){
                    count++;
                    i++;
                }
                else{
                    break;
                }
            }
            if(count > 1){
                ans.append(count);
            }

        }

        for(int i=0;i<ans.length(); i++){
            chars[i] = ans.charAt(i);
        }

        return ans.length();
    }
}
