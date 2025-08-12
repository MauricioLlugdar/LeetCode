class Solution {
    public int reverse(int x) {
        boolean signed = x<0;
        x = signed ? x*(-1) : x;
        int actNum, count =-1, auxVal = x;
        long resNum =0;
        while(x>0){
            count++;
            actNum = x % 10;
            x= x/10;
            resNum = actNum + 10*resNum;
        }

        if(resNum > Integer.MAX_VALUE){
            return 0;
        }
        resNum = signed ? (-1)*resNum : resNum;
        return (int)resNum;
    }
}