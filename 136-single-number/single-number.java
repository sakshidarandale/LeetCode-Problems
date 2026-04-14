class Solution {
    public int singleNumber(int[] nums)
    {
        int Ans = 0;

        for(int i = 0; i < nums.length;i++)
        {
            Ans = Ans ^ nums[i];   // 1 ^ 1 = 0 and 1 ^ 0 = 1
        }

        return Ans;
    }
}