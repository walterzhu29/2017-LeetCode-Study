class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hash = new HashMap<Integer, Integer>();
        int[] result = new int[2];
        for(int i = 0; i < nums.length; i++)
        {
            if(hash.containsKey(target - nums[i]))
            {
                result[0] = hash.get(target - nums[i]);
                result[1] = i;
                return result;
            }
            else
                hash.put(nums[i], i);
        }
        return result;
    }
}