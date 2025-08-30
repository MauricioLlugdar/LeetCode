class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length<=1)return nums.length;
        int fill=0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i-1] == nums[i]) {
                nums[fill++] = nums[i-1];
                nums[fill++] = nums[i];
                while (i < nums.length && nums[i-1] == nums[i]) {
                    i++;
                    if (i == nums.length) {
                        return fill;
                    }
                }
            }else {
                nums[fill++] = nums[i-1];
            }
        }
        nums[fill++] = nums[nums.length-1];
        return  fill;
    }
}