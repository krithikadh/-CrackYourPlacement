class Solution {
    static Node subLinkedList(Node head1, Node head2) {
        while (head1 != null && head1.next != null && head1.data == 0) {
            head1 = head1.next;
        }
        while (head2 != null && head2.next != null && head2.data == 0) {
            head2 = head2.next;
        }
        int n1 = length(head1);
        int n2 = length(head2);
        if (n1 == 0 && n2 == 0) {
            return new Node(0);
        }
        if (n1 < n2) {
            return subLinkedList(head2, head1);
        } else if (n1 == n2) {
            Node t1 = head1;
            Node t2 = head2;
            while (t1 != null && t2 != null && t1.data == t2.data) {
                t1 = t1.next;
                t2 = t2.next;
            }
            if (t1 == null) {
                return new Node(0);
            } else if (t1.data < t2.data) {
                return subLinkedList(head2, head1);
            }
        }
        head1 = reverse(head1);
        head2 = reverse(head2);
        Node t1 = head1;
        Node t2 = head2;
        Node res = null;
        while (t1 != null) {
            int sub = 0;
            if (t2 != null) {
                sub = t2.data;
                t2 = t2.next;
            }
            if (t1.data < sub) {
                t1.next.data -= 1;
                t1.data += 10;
            }
            Node n = new Node(t1.data - sub);
            t1 = t1.next;
            n.next = res;
            res = n;
        }
        while (res != null && res.next != null && res.data == 0) {
            res = res.next;
        }
        return res;
    }

    static int length(Node head) {
        int len = 0;
        while (head != null) {
            len++;
            head = head.next;
        }
        return len;
    }

    static Node reverse(Node head) {
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
