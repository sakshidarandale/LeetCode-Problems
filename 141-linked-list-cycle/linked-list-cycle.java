

public class Solution
{
    public boolean hasCycle(ListNode head)
    {
        if(head == null) 
        {
            return false;
        }

        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null)
        {
            slow = slow.next;          
            fast = fast.next.next; 

            if(slow == fast)
            {
                return true;           // cycle 
            }
        }

        return false;                  // no cycle

    }
    
}


        // Set<ListNode> set = new HashSet<>();

        // while(head != null)
        // {
        //     if(set.contains(head))
        //     {
        //         return true;
        //     }

        //     set.add(head);

        //     head = head.next;
        // }

        // return false;