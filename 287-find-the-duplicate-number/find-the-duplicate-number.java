class Solution 
{
    public int findDuplicate(int[] nums) 
    {
        int slow = nums[0];
        int fast = nums[0];

        do   //cycle
        {
            slow = nums[slow];  // 1 step
            fast = nums[nums[fast]];  // 2 step 
        } 
        while(slow != fast); 

        //reset

        slow = nums[0];

        while(slow != fast)
        {
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;
    }
}
   