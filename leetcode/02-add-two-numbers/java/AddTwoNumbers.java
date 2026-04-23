public class AddTwoNumbers {
    
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyNode = new ListNode(0, null);
        ListNode curr = dummyNode;
        int carry = 0;
        
        while(l1 != null || l2 != null || carry != 0) {
            int val1 = (l1 != null) ? l1.val : 0;
            int val2 = (l2 != null) ? l2.val : 0;
            int sum = carry + val1 + val2;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            l1 = (l1 != null) ? l1.next : null;
            l2 = (l2 != null) ? l2.next : null;
        }
        return dummyNode.next;
    }
    
    public static void main(String[] args) {
        AddTwoNumbers main = new AddTwoNumbers();
        ListNode l13 = new ListNode(3, null);
        ListNode l12 = new ListNode(4, l13);
        ListNode l11 = new ListNode(2, l12);

        ListNode l23 = new ListNode(4, null);
        ListNode l22 = new ListNode(6, l23);
        ListNode l21 = new ListNode(5, l22);

        ListNode result = main.addTwoNumbers(l11, l21);
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}