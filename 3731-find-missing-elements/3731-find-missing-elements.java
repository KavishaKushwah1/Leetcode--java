class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        List<Integer> ans = new ArrayList<>();
        int start = nums[0];
        for(int x: nums){
            while(start<x){
                ans.add(start++);
            }
            start++;
        }
        return ans;
    }
}