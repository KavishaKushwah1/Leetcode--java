class Solution {
    public boolean sumGame(String num) {
        int n = num.length();
        int left = 0, right = 0;
        int qLeft = 0, qRight = 0;

        for (int i = 0; i < n / 2; i++) {
            if (num.charAt(i) == '?') qLeft++;
            else left += num.charAt(i) - '0';
        }

        for (int i = n / 2; i < n; i++) {
            if (num.charAt(i) == '?') qRight++;
            else right += num.charAt(i) - '0';
        }

        if ((qLeft + qRight) % 2 == 1) return true;

        int diff = left - right;
        int qDiff = qLeft - qRight;

        return diff != -9 * qDiff / 2;
    }
}