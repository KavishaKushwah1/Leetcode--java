class Solution {
    public int[] twoSum(int[] num, int target) {
        int i=0, j=num.length -1;
        int sum=0;
        while(i<j){
            sum = num[i]+num[j];
            if(sum==target){
                return new int[]{i+1, j+1};
            }else if(sum<target){
                i++;
            }else{
                j--;
            }
        }
        return new int[]{};
    }
}