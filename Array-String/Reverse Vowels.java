class Solution {
    public String reverseVowels(String s) {
        int n = s.length();
        char [] str = s.toCharArray();

        int start = 0;
        int end = n-1;

        String v = "aeiouAEIOU";

        while(start < end){
            while(start<end && v.indexOf(str[start]) == -1){
                start++;
            }

            while(start<end && v.indexOf(str[end]) == -1){
                end--;
            }

            char temp = str[start];
            str[start] = str[end];
            str[end] = temp;

            start++;
            end--;
        }

        String ans = new String(str);
        return ans;
    }
}
