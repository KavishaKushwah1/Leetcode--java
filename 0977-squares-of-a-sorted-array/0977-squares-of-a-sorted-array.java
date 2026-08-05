class Solution {
    public int[] sortedSquares(int[] nums) {
        int [] arr = new int[nums.length];
        int idx = 0;
        for(int i=0;i<nums.length;i++){
            arr[idx++] = nums[i]*nums[i];
        }
        Arrays.sort(arr);
        return arr;
    }
}