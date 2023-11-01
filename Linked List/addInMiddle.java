class  MyLinkedList {
    private Node head;
    private int size;

    MyLinkedList() {
        size = 0;
    }

    public class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    public void addInMiddle(int index, String data) {
        if (index > size || index < 0) {
            System.out.println("Invalid Index value");
            return;
        }
        size++;

        Node newNode = new Node(data);
        if (head == null || index == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node currNode = head;
        for (int i = 1; i < index; i++) {
            currNode = currNode.next;
        }

        Node nextNode = currNode.next;
        currNode.next = newNode;
        newNode.next = nextNode;
    }
}
