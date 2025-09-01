class Solution {
    public boolean isSubsequence(String s, String t) {
       if(s.isEmpty()) return true;
        int sIndex=0, tIndex=0;
        while(tIndex <= t.length()-1){
            if(sIndex > s.length()-1){
                return true;
            }
            if(s.charAt(sIndex) == t.charAt(tIndex)){
                sIndex++;
            }
            tIndex++;
        }
        return sIndex > s.length()-1;
    }
}