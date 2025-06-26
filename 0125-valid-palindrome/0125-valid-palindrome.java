class Solution {
    public boolean isPalindrome(String s) {
        char[] cleanString = s.trim().replaceAll("[^a-zA-Z0-9]", "").toLowerCase().toCharArray();
        int len = cleanString.length;
        int backwards = len-1;
        int forwards = 0;
        boolean res = true;
        while (backwards>forwards){
            res = res && cleanString[forwards] == cleanString[backwards];
            backwards--;
            forwards++;
        }
        return res;
    }
}