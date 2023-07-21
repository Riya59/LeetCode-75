class Solution {
    public boolean isSubsequence(String s, String t) {
        

       char str1[] = s.toCharArray();
       char str2[] = t.toCharArray();

       int i=0;
       int j=0;

       if(s.length() < 1){
           return true;
       }

       while(i<t.length()){
           if(str1[j] == str2[i]){
               j++;
           }
           i++;

           if(j == s.length()){
               return true;
           }
       }

       return false;

        
    }
}
