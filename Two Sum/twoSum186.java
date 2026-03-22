class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> nMap = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int complement = target - nums[i];
            if(nMap.containsKey(complement) && nMap.get(complement) != i){
                return new int[]{i, nMap.get(complement)};
            }
            nMap.put(nums[i], i);
        }
        return new int[]{};
    }
}