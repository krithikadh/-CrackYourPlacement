class Solution {
    Node compute(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        head = reverseList(head);
        Node current = head;
        int maxValue = current.data;
        while (current != null && current.next != null) {
            if (current.next.data < maxValue) {
                current.next = current.next.next;
            } else {
                current = current.next;
                maxValue = current.data;
            }
        }
        return reverseList(head);
    }

    private Node reverseList(Node head) {
        Node prev = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
}
