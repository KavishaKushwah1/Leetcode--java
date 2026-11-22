class Solution {
    public int[] sortedSquares(int[] nums) {
        int i=0;
        int j=nums.length-1;
        int[] arr = new int[nums.length];
        int idx=arr.length-1;
        while(i<=j){
            int left = nums[i]*nums[i];
            int right = nums[j]*nums[j];
            if(left<=right){
                arr[idx--] = right;
                j--;
            }else{
                arr[idx--] = left;
                i++;
            }
        }
        return arr;
    }
}