class Solution {
    public void moveZeroes(int[] nums) 
    {
        int i = 0;
        int j = 0;

        int temp = 0;

        while(i < nums.length)
        {
            if(nums[i] != 0)
            {
                temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;

                i++;
                j++;
            }
            else
            {
                i++;
            }
        }
    }
}