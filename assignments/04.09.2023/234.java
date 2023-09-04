class Solution {
    public static ListNode reverse(ListNode head){
        if(head==null){
            return head;
        }
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = curr.next;
        while(curr!=null){
            curr.next = prev;
            prev = curr;
            curr = next;
            if(next!=null){
            next = next.next; 
            }
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
       // FInding left Middle element:
       ListNode slow = head;
       ListNode fast =  head;
       while(fast.next!=null && fast.next.next!=null){
           slow = slow.next;
           fast = fast.next.next;
       }
       ListNode temp = reverse(slow.next);
       slow.next = temp;
       ListNode t1 = head;
       ListNode t2 = slow.next;
        
       while(t2!=null){
           if(t1.val!=t2.val){
               return false;
           }
           t1 = t1.next;
           t2 = t2.next;
       }
       return true;
    }
}