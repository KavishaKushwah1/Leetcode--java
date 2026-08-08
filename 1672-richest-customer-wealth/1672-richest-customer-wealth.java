class Solution {
    public int maximumWealth(int[][] acc) {
        int sum=0, m = 0;
        for(int i=0;i<acc.length;i++){
            for(int j=0;j<acc[0].length;j++){
                sum += acc[i][j];
            }
            m = Math.max(m, sum);
            sum=0;
        }
        return m;
    }
}