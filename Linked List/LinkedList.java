

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    public Node reverseListRecursive(Node head) {
        // Empty node or last node or only one node
        if (head == null || head.next == null) {
            return head;
        }

        Node newHead = reverseListRecursive(head.next);

        // Reverse the pointers
        head.next.next = head;
        head.next = null;

        return newHead;
    }

    public void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Create a sample linked list
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.println("Original linked list:");
        list.printList(head);

        Node reversedHead = list.reverseListRecursive(head);

        System.out.println("Reversed linked list:");
        list.printList(reversedHead);
    }
}
