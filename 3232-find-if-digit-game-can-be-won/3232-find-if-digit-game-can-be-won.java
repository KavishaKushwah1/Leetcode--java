class Solution {
    public boolean canAliceWin(int[] nums) {
        int countd = 0, counts = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<10){
                counts += nums[i];
            }else{
                countd += nums[i];
            }
        }
        return countd==counts ? false: true;
    }
}