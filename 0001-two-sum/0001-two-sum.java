class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hM= new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(hM.containsKey(target-nums[i])){
                return new int[]{i,hM.get(target-nums[i])};
            }
            hM.put(nums[i],i);
        }
        return new int[]{nums.length-1,hM.get(target-nums[nums.length-1])};
    }
}