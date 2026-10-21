class Solution {
    public int[] sortedSquares(int[] nums) {
        int i=0;
        int j=nums.length-1;
        int[] res = new int[nums.length];
        int id=res.length-1;
        while(i<=j){
            int left = nums[i]*nums[i];
            int right = nums[j]*nums[j];
            if(left>right){
                res[id] = left;
                i++;
            }else{
                res[id] = right;
                j--;
            }
            id--;
        }
        return res;
    }
}