public ListNode detectCycle(ListNode head) {
        if(head==null || head.next==null){
            return null;
        }
       ListNode slow = head;
       ListNode fast = head;
       while(fast!=null && fast.next!=null){
           slow = slow.next;
           fast = fast.next.next;
           if(slow==fast){
               break;
           }
       }
       if(fast==null || fast.next==null){
           return null;
       }
       ListNode temp = head;
       while(temp!=null){
           if(temp==slow){
               return temp;
           }
           temp = temp.next;
           slow = slow.next;
       }
       return null;
}
}