class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] arr = new int[nums.length];
        int i=0;
        int j= nums.length-1;
        int idx = nums.length-1;
        while(i<=j){
            int left = nums[i]*nums[i];
            int right = nums[j]*nums[j];
            if(left<right){
                arr[idx] = right;
                j--;
            }else{
                arr[idx] = left;
                i++;
            }
            idx--;
        }
        return arr;

    }
}