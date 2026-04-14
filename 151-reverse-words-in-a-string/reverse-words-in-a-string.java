class Solution {
    public String reverseWords(String str) 
    {
        str = str.trim();

        str = str.replaceAll("\\s+"," ");

        String Arr[] = str.split(" ");

        StringBuilder sb = new StringBuilder();

        for(int i = Arr.length - 1; i >= 0; i--)
        {
           sb.append(Arr[i]).append(" ");
        }
        return sb.toString().trim();
    }
    
}