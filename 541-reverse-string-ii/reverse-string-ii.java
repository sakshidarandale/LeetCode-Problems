class Solution 
{
    public String reverseStr(String s, int k) 
    {
        char Arr[] = s.toCharArray();

        for(int i = 0; i < Arr.length; i = i + 2 * k)
        {
            int start = i;
            int end = Math.min(i + k - 1,Arr.length - 1);
            while(start < end)
            {
                char temp = Arr[start];
                Arr[start] = Arr[end];
                Arr[end] = temp;

                start++;
                end--;
            }
        }

        return new String(Arr);       
    }
}