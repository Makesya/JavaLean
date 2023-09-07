package Lists;

public class LinkedListClass {

    public class Node {
        Node next;
        int value;
    }

    Node head;

    public void add(int value) {
        Node newNode = new Node();
        newNode.value = value;

        if (head != null) {
            newNode.next = head;
        }
        head = newNode;
    }

    public void remove() {
        if (head != null) {
            head = head.next;
        }
    }

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

    public void addEnd(int value) {
        Node newNode = new Node();
        newNode.value = value;
        if (head == null) {
            head = newNode;
        } else {
            Node lastNode = head;
            while (lastNode.next != null) {
                lastNode = lastNode.next;
            }
            lastNode.next = newNode;
        }
    }

    public void remEnd(){
        if (head != null){
            Node preLastElement = head;
            while (preLastElement.next != null){
                if (preLastElement.next.next == null){
                    preLastElement.next = null;
                    return;
                } preLastElement = preLastElement.next;
            } head = null;
        }
    }
}
