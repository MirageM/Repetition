class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> nMap = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            nMap.put(nums[i], i);
        }
        for(int i = 0; i < nums.length; i++){
            int diff = target- nums[i];
            if(nMap.containsKey(diff) && nMap.get(diff) != i){
                return new int[]{i, nMap.get(diff)};
            }
        }
        return new int[]{};
    }
}