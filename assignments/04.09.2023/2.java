class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int ans = 0;
        ListNode temp  = new ListNode(0);
        ListNode flap = temp;
        while(l1!=null || l2!=null || ans>0){
            if(l1!=null){
                ans += l1.val;
                l1 = l1.next;
            }
            if(l2!=null){
                ans += l2.val;
                l2 = l2.next;
            }
            temp.next = new ListNode(ans%10);
            ans = ans/10;
            temp = temp.next;
        }
        return flap.next;
    }
}