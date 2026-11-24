class Solution {
    public int totalFruit(int[] f) {
        int low=0;
        int max=1;
        HashMap<Integer, Integer> freq = new HashMap<>();
        for(int high=0;high<f.length;high++){
            int num = f[high];
            freq.put(num, freq.getOrDefault(num, 0)+1);
            while(freq.size()>2){
                int left = f[low];
                freq.put(left, freq.get(left)-1);
                if(freq.get(left)==0){
                    freq.remove(left);
                }low++;

            }
            if(freq.size()<=2){
                max = Math.max(max, high-low+1);
            }
        }
        return max;
    }
}