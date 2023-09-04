public class Solution {
    public ListNode getIntersectionNode(ListNode h1, ListNode h2) {
        int l1 = 0;
        int l2 = 0;
        int diff = 0;
        ListNode t1 = h1;
        ListNode t2 = h2;
        while(t1!=null){
            l1++;
            t1 = t1.next;
        }
        while(t2!=null){
            l2++;
            t2 = t2.next;
        }
        t1 = h1;
        t2 = h2; 
        if(l1>l2){
            diff = l1-l2;
            while(diff-->0){
                t1 = t1.next;
            }
        }
        else if(l2>l1){
            diff = l2-l1;
            while(diff-->0){
                t2 = t2.next;
            }
        } 
        while(t1!=null){
            if(t1==t2){
                return t1;
            }
            t1 = t1.next;
            t2 = t2.next;
        }
        return null;
          
    }
}