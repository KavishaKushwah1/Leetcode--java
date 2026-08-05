class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> arr = new ArrayList<>();
        
        int n = nums.length;
        for(int i=0;i<n-2;i++){
            int left =i+1;
            int right = n-1;
            int target = nums[i]*-1;
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            while(left<right){
                int sum = nums[left]+nums[right];
                if(sum==target){
                    arr.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                    while(left<right && nums[left]==nums[left-1]){
                        left++;
                    }
                    while(left<right && nums[right]==nums[right+1]){
                        right--;
                    }
                }else if(sum <target){
                    left++;
                }else{
                    right--;
                }
            }
            
        }
        return arr;
}
}