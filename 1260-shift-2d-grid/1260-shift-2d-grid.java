class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m=grid.length;
        int n = grid[0].length;
        int t = m*n;
        k %=t;
        int[][] ans= new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int oldi = i*n+j;
                int newi = (oldi + k)%t;
                int row = newi/n;
                int col = newi%n;
                ans[row][col] = grid[i][j];
            }
        }
        List<List<Integer>> res = new ArrayList<>();
        for (int[] row : ans) {
            List<Integer> list = new ArrayList<>();
            for (int num : row) {
                list.add(num);
            }
            res.add(list);
        }

        return res;
        
    }
}