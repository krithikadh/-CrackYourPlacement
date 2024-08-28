// Java Program to sort a linked list of 0s, 1s or 2s

class Node {
    int data;
    Node next;
    Node(int new_data) {
        data = new_data;
        next = null;
    }
}

// Function to sort a linked list of 0s, 1s and 2s
class GfG {
  
    static void sortList(Node head) {
      
        // Initialize count of '0', '1' and '2' as 0
        int[] cnt = { 0, 0, 0 };
        Node ptr = head;

        // Traverse and count total number of '0', '1' and '2'
        // cnt[0] will store total number of '0's
        // cnt[1] will store total number of '1's
        // cnt[2] will store total number of '2's
        while (ptr != null) {
            cnt[ptr.data] += 1;
            ptr = ptr.next;
        }

        int idx = 0;
        ptr = head;
        
        // Fill first cnt[0] nodes with value 0
        // Fill next cnt[1] nodes with value 1
        // Fill remaining cnt[2] nodes with value 2
        while (ptr != null) {
            if (cnt[idx] == 0)
                idx += 1;
            else {
                ptr.data = idx;
                cnt[idx] -= 1;
                ptr = ptr.next;
            }
        }
    }

    static void printList(Node node) {
        while (node != null) {
            System.out.print(" " + node.data);
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
      
        // Create a hard-coded linked list:
        // 1 -> 1 -> 2 -> 1 -> 0 -> NULL
        Node head = new Node(1);
        head.next = new Node(1);
        head.next.next = new Node(2);
        head.next.next.next = new Node(1);
        head.next.next.next.next = new Node(0);

        System.out.print("Linked List before Sorting:");
        printList(head);

        sortList(head);

        System.out.print("Linked List after Sorting:");
        printList(head);
    }
}
