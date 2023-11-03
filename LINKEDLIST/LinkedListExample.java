public class LinkedListExample {
    Node head;
    private int size;

    public static class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    LinkedListExample() {
        size = 0;
    }

    // Add a new node to the end of the linked list
    public void addLast(String data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }

        size++;
    }

    // Add a new node to the beginning of the linked list
    public void addFirst(String data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        size++;
    }

    // Print the elements of the linked list
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Get the size of the linked list
    public int getSize() {
        return size;
    }

    // Remove the first node from the linked list
    public void removeFirst() {
        if (head != null) {
            head = head.next;
            size--;
        }
    }

    // Remove the last node from the linked list
    public void removeLast() {
        if (head != null) {
            if (head.next == null) {
                head = null;
            } else {
                Node current = head;
                while (current.next.next != null) {
                    current = current.next;
                }
                current.next = null;
            }
            size--;
        }
    }

    public static void main(String args[]) {
        LinkedListExample list = new LinkedListExample();
        list.addLast("is");
        list.addLast("a");
        list.addLast("list");
        list.printList();

        list.addFirst("this");
        list.printList();
        System.out.println("Size: " + list.getSize());

        list.removeFirst();
        list.printList();

        list.removeLast();
        list.printList();
    }
}
