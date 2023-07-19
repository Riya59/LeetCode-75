class Solution {
    public String mergeAlternately(String word1, String word2) {

        int n1 = word1.length();
        int n2 = word2.length();

        char s1[] = word1.toCharArray();
        char s2[] = word2.toCharArray();

        String s= "";
        // for(int i=0,j=0; i<n1 && j<n2; i++,j++){
        //     s = s + s1[i] + s2[i];
           
        // }
        int i=0,j=0;
        while(i<n1 || j<n2){
            if(i<n1){
                s = s+s1[i];
                i++;
            }
            if(j<n2){
                s = s+s2[j];
                j++;
            }
        }
        return s;

    }
}
