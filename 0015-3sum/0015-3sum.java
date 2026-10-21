class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        ArrayList<List<Integer>> res = new ArrayList<>();
        int n = nums.length;
        for(int k=0;k<n-2;k++){
            int i=k+1;
            int j = nums.length-1;
            int ans = nums[k]*-1;
            if(k>0&& nums[k]==nums[k-1]){
                continue;
            }
            while(i<j){
                int sum = nums[i]+nums[j];
                if(sum==ans){
                    res.add(Arrays.asList(nums[k], nums[i], nums[j]));
                    i++;
                    j--;
                    while(i<j&&nums[i]==nums[i-1]){
                        i++;
                    }
                    while(i<j&&nums[j]==nums[j+1]){
                        j--;
                    }
                }
                else if(sum<ans){
                    i++;
                }else{
                    j--;
                }
            }
        }
        return res;
    }
}