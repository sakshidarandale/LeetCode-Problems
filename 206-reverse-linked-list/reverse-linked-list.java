
class Solution {
    public ListNode reverseList(ListNode head)
    {
        List<Integer> Arr = new ArrayList<>();

        ListNode temp = head;

        while(temp != null)
        {
            Arr.add(temp.val);
            temp = temp.next;
        }


        temp = head;

        for(int i = Arr.size() - 1; i >=0; i--)
        {
            temp.val = Arr.get(i);
            temp = temp.next;
        }

        return head;
    }
}