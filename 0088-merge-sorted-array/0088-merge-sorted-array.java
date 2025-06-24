import static java.util.Arrays.sort;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int c = n+m-1;
        while(n-1>=0){
            if(m>=1 && nums1[m-1]>nums2[n-1]){
                m--;
                nums1[c--] = nums1[m];
            } else{
                n--;
                nums1[c--] = nums2[n];
            }
        }
    }
}