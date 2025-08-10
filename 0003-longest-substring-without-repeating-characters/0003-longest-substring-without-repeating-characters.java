import java.util.HashSet;
import java.util.Set;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> subSubStr = new HashSet<>();
        int lenLongSubStr = 0;
        int maxLenLongSubStr = 0;
        char actChar;
        for (int i = 0; i < s.length(); i++) {
            actChar = s.charAt(i);
            if(!subSubStr.contains(actChar)){
                subSubStr.add(actChar);
                lenLongSubStr++;
            }else{
                subSubStr.clear();
                maxLenLongSubStr = Math.max(lenLongSubStr, maxLenLongSubStr);
                i = i - lenLongSubStr; // Start with the next char after the break pattern begin
                lenLongSubStr = 0;
            }
        }

        return Math.max(lenLongSubStr, maxLenLongSubStr); // compare also the last part of the string

    }
}