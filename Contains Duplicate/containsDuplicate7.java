class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> hset1 = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            if(hset1.contains(nums[i])){
                return true;
            }
            hset1.add(nums[i]);
        }
        return false;
    }
}