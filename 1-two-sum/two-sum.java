class Solution {
    public int[] twoSum(int[] nums, int target) 
    {
        int n = nums.length;
        int Ans[] = {-1};

        HashMap<Integer,Integer> mp = new HashMap<>();

        for(int i = 0; i < n; i++)
        {
            int partner = target - nums[i];

            if(mp.containsKey(partner))
            {
                Ans= new int[]{mp.get(partner),i};
                return Ans;
            }

            mp.put(nums[i],i);
        }
        return Ans;
    
    }
}