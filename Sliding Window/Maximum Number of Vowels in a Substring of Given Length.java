class Solution {
    public int maxVowels(String s, int k) {
        int count = 0;
        HashSet<Character>set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');

        int count_v = 0;
    

        int n = s.length();

        for(int i=0;i<k;i++){
            if(set.contains(s.charAt(i))){
                count_v++;
            }
        }

        int f_count = count_v;
        for(int j=k;j<n;j++){
            if(set.contains(s.charAt(j))){
                count_v++;
            }
            if(set.contains(s.charAt(j-k))){
                count_v--;
            }

            f_count = Math.max(count_v, f_count);
        }

        return f_count;
    }
}
