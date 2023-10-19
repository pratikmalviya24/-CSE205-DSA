class Solution {
    public ListNode insertionSortList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode curr = head,next = head;
        ListNode dummy = new ListNode(Integer.MIN_VALUE);
        ListNode temp = dummy;
        while(curr!=null){
            next = curr.next;
            while(temp.next!=null && temp.next.val<curr.val){
                temp  =temp.next;
            }
            curr.next = temp.next;
            temp.next = curr;
            curr = next;
            temp = dummy;
        }
        return dummy.next;
    }
}