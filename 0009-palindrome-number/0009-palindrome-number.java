class Solution {
    public boolean isPalindrome(int x) {
        int original=x;
        int temp =x;
        int rev=0;
        if(x<0){
            return false;
        }
        while(temp>0){
            int dig = temp%10;
            rev = rev*10+dig;
            temp/=10;
        }
        if(original == rev){
            return true;
        }else{
            return false;
        }
    }
}