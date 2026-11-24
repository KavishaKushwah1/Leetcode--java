class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int low=0;  
        int sum=0;  
        int min = Integer.MAX_VALUE;
        int max = Integer.MAX_VALUE;
        for(int high=0; high<nums.length;high++){
            sum += nums[high];
            while(sum>=target){
                int len = high-low+1;
                min = Math.min(min, len);
                low++;
                sum -= nums[low-1];
            }

        }
        
        return min == max ? 0: min;
    }
}