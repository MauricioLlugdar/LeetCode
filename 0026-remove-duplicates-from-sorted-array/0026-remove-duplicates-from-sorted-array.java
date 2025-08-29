class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length <= 1) return nums.length;

        int fill = 1;
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i] != nums[i+1]){
                nums[fill++] = nums[i+1];
            }
        }

        return fill;
    }
}