class Solution {
    public boolean canAliceWin(int[] nums) {
        int i=0, j=0;
        for(int num : nums){
            if(num<10)
            i+= num;
            else
            j+=num;
        }
        return i==j ? false: true;
    }
}