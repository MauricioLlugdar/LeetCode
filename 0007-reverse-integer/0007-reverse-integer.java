class Solution {
    public int reverse(int x) {
        boolean signed = x<0;
        x = signed ? x*(-1) : x;
        int actNum, resNum = 0, count =-1, auxVal = x;
        if(x == Integer.MIN_VALUE){
            return 0;
        }
        while(x>0){
            count++;
            System.out.println("NOENTRA");
            actNum = x % 10;
            x= x/10;
            resNum = actNum + 10*resNum;
        }

        if(auxVal%10 != 0 && auxVal%10 != resNum/((int)Math.pow(10,count))){
            return 0;
        }
        resNum = signed ? (-1)*resNum : resNum;
        return resNum;
    }
}