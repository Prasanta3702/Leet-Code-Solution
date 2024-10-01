// Add two numbers

public class Q2 {

    /*
     * Answer of question 2.
     */
    
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode p1 = l1;
        ListNode p2 = l2;
        ListNode output = new ListNode();
        ListNode head = output;
        
        int carry = 0;

        while(p1 != null || p2 != null) {
            
            int x = 0;
            int y = 0;

            if(p1 != null) {
                x = p1.val;
                p1 = p1.next;
            }

            if(p2 != null) {
                y = p2.val;
                p2 = p2.next;
            }

            int res = x + y + carry;
            carry = 0;  // reset carry value

            if(res >= 10) {
                carry = res / 10;
                output.next = new ListNode(res % 10);
            } else {
                output.next = new ListNode(res);
            }
            output = output.next;
        }

        // check if carry has value
        if(carry != 0) {
            output.next = new ListNode(carry);
        }

        return head.next;
    }







    public static void main(String[] args) {
        ListNode l1 = new ListNode();
        ListNode l2 = new ListNode();

        l1.val = 2;
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        l2.val = 5;
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        // print the output
        ListNode output = addTwoNumbers(l1, l2);
        display(output);
    }

    public static void display(ListNode l) {
        ListNode ptr = l;
        while(ptr != null) {
            System.out.print(ptr.val+" ");
            ptr = ptr.next;
        }
    }


    static class ListNode {
        int val;
        ListNode next;
    
        public ListNode() {}
        public ListNode(int value) {
            this.val = value;
        }
    }
}
