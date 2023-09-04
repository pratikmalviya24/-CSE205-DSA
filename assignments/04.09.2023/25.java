class Solution {
    public static int length(ListNode temp){
        int c = 0;
        while(temp!=null){
            c++;
            temp = temp.next;
        }
        return c;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        int l = length(head);
        int[] nums = new int[l];
        int i =0; 
        ListNode temp =head;
        while(temp!=null){
            nums[i++] = temp.val;
            temp = temp.next;
        }
        int t = l/k;
        i  = 0;
        int j = k-1;
        while(t-->0){
            reverse(nums, i, j);
            i = j+1;
            j +=k;
        }
        head = new ListNode(0);
        temp = head;
        for(int item : nums){
            ListNode node = new ListNode(item);
            temp.next = node;
            temp = node;
        }
        return head.next;

    }

    public static void reverse(int [] arr,int i,int j){
        while(i<j){
            swap(arr, i++, j--);
        }
    }
    public static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}