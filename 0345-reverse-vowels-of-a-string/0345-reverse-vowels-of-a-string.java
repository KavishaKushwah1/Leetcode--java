class Solution {
    public String reverseVowels(String s) {
        StringBuilder st = new StringBuilder(s);
        int i=0;
        int j  = st.length()-1;
        while(i<j){
            while(i<j && !vowels(st.charAt(i))){
                i++;
            }
            while(i<j&& !vowels(st.charAt(j))){
                j--;
            }
            char temp = st.charAt(i);
            st.setCharAt(i, st.charAt(j));
            st.setCharAt(j, temp);
            i++;
            j--;
            
        }
        return st.toString();
    }
        boolean vowels(char ch){
            return "aeiouAEIOU".indexOf(ch)!=-1;
    }
}