class Solution {
    public boolean isPalindrome(String s) {
        String cleanString = s.trim().replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int len = cleanString.length();
        int backwards = len-1;
        int forwards = 0;
        boolean res = true;
        while (backwards>forwards){
            res = res && cleanString.charAt(forwards) == cleanString.charAt(backwards);
            backwards--;
            forwards++;
        }
        return res;
    }
}