class Solution {
    public int equalPairs(int[][] grid) {
        int n = grid.length;
        int c = 0;

        int t[] = new int[n];

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                t[j] = grid[j][i];
            }

            for(int j=0; j<n; j++){
                if(Arrays.equals(t,grid[j])){
                    c++;
                }
            }

        }

        return c;
    }
}
