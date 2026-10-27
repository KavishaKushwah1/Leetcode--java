class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int best=0;
        int max = Integer.MAX_VALUE;
        int n=nums.length;
        for(int i=0;i<n-2;i++){
            int left = i+1;
            int right = n-1;
            while(left<right){
                int sum = nums[i]+nums[left]+nums[right];
                int diff = Math.abs(target-sum);
                if(diff<max){
                    max=diff;
                    best = sum;
                }
                if(sum>target)
                right--;
                if(sum<target)
                left++;
                if(sum==target)
                return sum;
            }
        }
        return best;
    }
}