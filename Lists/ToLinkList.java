package Lists;

public class ToLinkList {

    public class Node {
        Node next;
        Node previous;
        int value;
    }

    Node head;
    Node tail;

    //============================================================
    // Append to head
    //============================================================

    public void add(int value) {
        Node newNode = new Node();
        newNode.value = value;

        if (head != null) {
            newNode.next = head;
            head.previous = newNode;
        } else {
            tail = newNode;
        }
        head = newNode;
    }

    //============================================================
    // Remove for head
    //============================================================

    public void remove() {
        if (head != null && head.next != null) {
            head = head.next;
            head.previous = null;
        } else {
            head = null;
            tail = null;
        }
    }

    //============================================================
    // Find node in list
    //============================================================

    public boolean find(int value) {
        Node currentNode = head;
        while (currentNode != null) {
            if (currentNode.value == value) {
                return true;
            }
            currentNode = currentNode.next;
        }
        return false;
    }

    //============================================================
    // Append to end
    //============================================================

    public void addEnd(int value) {
        Node newNode = new Node();
        newNode.value = value;
        if (head == null) {
            head = newNode;
        } else {
            newNode.previous = tail;
            tail.next = newNode;
        }
        tail = newNode;
    }

    //============================================================
    // Remove for end
    //============================================================

    public void remEnd() {
        if (tail != null && tail.previous != null) {
            tail = tail.previous;
            tail.next = null;
        } else {
            head = null;
            tail = null;
        }
    }
    //============================================================
    // Bubble Sorting
    //============================================================

    public void bubbleSort() {
        boolean isSort = true;
        while (isSort) {
            isSort = false;
            Node i = head;
            while (i != null && i.next != null) {
                if (i.value > i.next.value) {
                    int tmp = i.value;
                    i.value = i.next.value;
                    i.next.value = tmp;
                    isSort = true;
                }
                i = i.next;
            }
        }
    }
}
