class Solution {
public:
    ListNode* addTwoNumbers(ListNode* l1, ListNode* l2) {
        if(!l1 && !l2)
            return NULL;
        ListNode* dummy = new ListNode(0), *move = dummy;
        int carry = 0;
        while(l1 || l2 || carry){
            int sum = carry;
            if(l1){
                sum += l1->val;
                l1 = l1->next;
            }
            if(l2){
                sum += l2->val;
                l2 = l2->next;
            }
            if(sum >= 10){
                sum -= 10;
                carry = 1;
            }
            else
                carry = 0;
            move->next = new ListNode(sum);
            move = move->next;
        }
        return dummy->next;
    }
};