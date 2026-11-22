class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int best = 0;
        int max = Integer.MAX_VALUE;
        int n  = nums.length;
        for(int k=0;k<n-2;k++){
            int i=k+1;
            int j = n-1;
            while(i<j){
                int sum = nums[i]+nums[j]+nums[k];
                int diff= Math.abs(target-sum);
                if(diff<max){
                max = diff;
                best = sum;
                }
                if(sum>target){
                    j--;
                }else if(sum<target){
                    i++;
                }else 
                return sum;
            }
        }
        return best;
    }
}