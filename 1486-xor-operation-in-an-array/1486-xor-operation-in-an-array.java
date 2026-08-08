class Solution {
    public int xorOperation(int n, int start) {
        int sum =  0;
        int []num = new int[n];
        for(int i=0;i<num.length;i++){
            int ans = start +2 *i;
            sum ^= ans;
        }
        return sum;        
    }
}