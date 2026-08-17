class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        for(String s: operations){
            if(s.equals("+"))
            st.push(st.get(st.size()-1) + st.get(st.size()-2));
            else if (s.equals("D"))
            st.push(2* st.peek());
            else if(s.equals("C"))
            st.pop();
            else
            st.push(Integer.parseInt(s));
        }
        int sum=0;
        for(int num: st){
            sum+=num;
        }
        return sum;
    }
}