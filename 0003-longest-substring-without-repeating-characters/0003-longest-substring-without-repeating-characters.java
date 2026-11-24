class Solution {
    public int lengthOfLongestSubstring(String s) {
        int low=0;
        int max=0;
        Map<Character, Integer>freq= new HashMap<>();
        for(int high=0;high<s.length();high++){
            char c= s.charAt(high);
            freq.put(c, freq.getOrDefault(c, 0)+1);
            while(freq.get(c)>1){
                char left = s.charAt(low);
                freq.put(left, freq.get(left)-1);
                if(freq.get(left)==0){
                    freq.remove(left);
                }
                low++;
            }
            if(freq.get(c)==1){
                max = Math.max(max, high-low+1);

            }
        }
        return max;
    }
}