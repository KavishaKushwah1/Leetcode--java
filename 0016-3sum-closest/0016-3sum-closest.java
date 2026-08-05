class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int best = 0;
        int m = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                int diff = Math.abs(target-sum);
                if (diff < m) {
                    m = diff;
                    best = sum;
                }
                if (sum < target) {
                    left++;
                }
                if (sum > target) {
                    right--;
                }
                if (sum == target) {
                    return sum;
                }

            }
        }
        return best;
    }
}