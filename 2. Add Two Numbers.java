class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null && l2 == null)
            return null;
        ListNode dummy = new ListNode(0);
        ListNode move = dummy;
        int carry = 0;
        while(l1 != null || l2 != null || carry != 0){
            int sum = carry;
            if(l1 != null){
                sum += l1.val;
                l1 = l1.next;
            }
            if(l2 != null)
            {
                sum += l2.val;
                l2 = l2.next;
            }
            if(sum >= 10)
            {
                carry = 1;
                sum -= 10;
            }
            else
                carry = 0;
            move.next = new ListNode(sum);
            move = move.next;
        }
        return dummy.next;
    }
}