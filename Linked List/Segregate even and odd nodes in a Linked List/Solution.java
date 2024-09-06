// Java program to segregate even and odd nodes in a
// Linked List

class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}
public class GfG {

    // Function to segregate even and odd nodes
    // and return the head of the new list.
    static Node segregateEvenOdd(Node head) {
      
        // Starting node of list having even values.
        Node evenStart = null;
        Node evenEnd = null;

        // Same for the odd list.
        Node oddStart = null;
        Node oddEnd = null;

        // Node to traverse the list.
        Node currNode = head;

        while (currNode != null) {
            int val = currNode.data;

            // If current value is even, add it to the even
            // values list.
            if (val % 2 == 0) {
                if (evenStart == null) {
                    evenStart = currNode;
                    evenEnd = evenStart;
                }
                else {
                    evenEnd.next = currNode;
                    evenEnd = evenEnd.next;
                }
            }
            else {
              
                // If current value is odd, add it to the
                // odd values list.
                if (oddStart == null) {
                    oddStart = currNode;
                    oddEnd = oddStart;
                }
                else {
                    oddEnd.next = currNode;
                    oddEnd = oddEnd.next;
                }
            }

            // Move to the next node.
            currNode = currNode.next;
        }

        // If either odd list or even list is empty, return
        // the head as is.
        if (oddStart == null || evenStart == null)
            return evenStart;

        // Add odd list after even list.
        evenEnd.next = oddStart;
        oddEnd.next = null;

        // Return the head of the modified list.
        return evenStart;
    }

    static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
      
        // Create a sample linked list:
        // 0->1->4->6->9->10->11
        Node head = new Node(0);
        head.next = new Node(1);
        head.next.next = new Node(4);
        head.next.next.next = new Node(6);
        head.next.next.next.next = new Node(9);
        head.next.next.next.next.next = new Node(10);
        head.next.next.next.next.next.next = new Node(11);

        System.out.print("Original Linked list: ");
        printList(head);

        head = segregateEvenOdd(head);

        System.out.print("Modified Linked list: ");
        printList(head);
    }
}
