class Solution {
    public int differenceOfSums(int n, int m) {
        int nond=0, d=0;
        for(int i=1;i<=n;i++){
            if(i%m==0){
                d+=i;
            }else{
                nond += i;
            } 
        }
        return nond-d;
    }
}