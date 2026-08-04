class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        ArrayList<Integer> n = new ArrayList<>(nums.length);
        Arrays.sort(nums);
        int small = nums[0];
        int large = nums[nums.length-1];
        for(int i=small; i<=large;i++){
            n.add(i);
        }
        for(int i=0;i<nums.length;i++){
            if(n.contains(nums[i])){
                n.remove(Integer.valueOf(nums[i]));
            }
        }
        return n;
    }
}