class Solution {
    public String triangleType(int[] nums) {
        int i=0,j=1,k=2;
        if(nums[i]+nums[j]<=nums[k] || nums[i]+nums[k]<=nums[j] || nums[j]+nums[k]<=nums[i])
            return "none";
        if(nums[i]==nums[j] && nums[j]==nums[k])return "equilateral";
        else if(nums[i]==nums[j] || nums[i]==nums[k] || nums[j]==nums[k]) return "isosceles";
        else if(nums[i]!=nums[j] && nums[j]!=nums[k]) return "scalene";
        return null;
    }
}