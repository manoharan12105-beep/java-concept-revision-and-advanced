public class MyLinkedList {
    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;
    private int size;

    public MyLinkedList() {
        head = null;
        size = 0;
    }

    public void insertFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        size++;
    }

    public void insertLast(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        size++;
    }

    public void insertAtPosition(int data, int position) {
        if (position < 0 || position > size) {
            System.out.println("Invalid position");
            return;
        }

        if (position == 0) {
            insertFirst(data);
            return;
        }

        Node newNode = new Node(data);
        Node temp = head;

        for (int i = 0; i < position - 1; i++) {
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;
        size++;
    }

    public void deleteByValue(int key) {
        if (head == null) return;

        if (head.data == key) {
            head = head.next;
            size--;
            return;
        }

        Node temp = head;

        while (temp.next != null && temp.next.data != key) {
            temp = temp.next;
        }

        if (temp.next != null) {
            temp.next = temp.next.next;
            size--;
        }
    }

    public void deleteAtPosition(int position) {
        if (position < 0 || position >= size) {
            System.out.println("Invalid position");
            return;
        }

        if (position == 0) {
            head = head.next;
            size--;
            return;
        }

        Node temp = head;

        for (int i = 0; i < position - 1; i++) {
            temp = temp.next;
        }

        temp.next = temp.next.next;
        size--;
    }

    public boolean search(int key) {
        Node temp = head;

        while (temp != null) {
            if (temp.data == key)
                return true;
            temp = temp.next;
        }

        return false;
    }

    public void reverse() {
        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        head = prev;
    }

    public void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public int getSize() {
        return size;
    }

    public static void main(String[] args) {

        MyLinkedList list = new MyLinkedList();

        list.insertFirst(10);
        list.insertFirst(5);
        list.insertLast(20);
        list.insertAtPosition(15, 2);

        System.out.println("List:");
        list.display();

        list.deleteByValue(10);
        System.out.println("After deleting 10:");
        list.display();

        list.reverse();
        System.out.println("After reversing:");
        list.display();

        System.out.println("Size: " + list.getSize());
        System.out.println("Search 20: " + list.search(20));
    }
}

/*
Output 

  List:
  5 -> 10 -> 15 -> 20 -> null
  After deleting 10:
  5 -> 15 -> 20 -> null
  After reversing:
  20 -> 15 -> 5 -> null
  Size: 3
  Search 20: true
  
*/
