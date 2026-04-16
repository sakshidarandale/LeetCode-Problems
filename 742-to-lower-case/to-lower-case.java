class Solution {
    public String toLowerCase(String s) 
    {
        char Arr[] = s.toCharArray();

        for(int i = 0; i < Arr.length; i++)
        {
            if(Arr[i] >= 'A' && Arr[i] <= 'Z')
            {
                Arr[i] = (char) (Arr[i] + 32);
            }
        }

        return new String(Arr);
    }
}