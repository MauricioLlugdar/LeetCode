class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, int[]> sums = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                sums.put(nums[i]+nums[j], new int[]{i,j});
                if(nums[i]+nums[j] ==target){
                    return sums.get(target);
                };
            }
        }
        return sums.get(target);
    }
}