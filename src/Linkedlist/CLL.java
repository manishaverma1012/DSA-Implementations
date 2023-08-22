package Linkedlist;

public class CLL {
    static class Node {
        int data;
        Node next;
    }
    static Node insertToEmpty(Node last, int data) {
        if (last != null)
            return last;

        // allocate memory to the new node
        Node newNode = new Node();

        // assign data to the new node
        newNode.data = data;

        // assign last to newNode
        last = newNode;

        // create link to iteself
        newNode.next = last;

        return last;
    }
    static Node insertFront(Node last, int data) {
        if (last == null)
            return insertToEmpty(last,data);

        Node newNode=new Node();

        // add data to the node
        newNode.data = data;

        // store the address of the current first node in the newNode
        newNode.next = last.next;

        // make newNode as head
        last.next = newNode;

        return last;
    }
    static Node insertEnd(Node last, int data) {
        if (last == null)
            return insertToEmpty(last, data);

        // allocate memory to the new node
        Node newNode = new Node();

        // add data to the node
        newNode.data = data;

        // store the address of the head node to next of newNode
        newNode.next = last.next;

        // point the current last node to the newNode
        last.next = newNode;

        // make newNode as the last node
        last = newNode;

        return last;
    }
    static Node deleteNode(Node last, int key) {
        // if linked list is empty
        if (last == null)
            return null;

        // if the list contains only a single node
        if (last.data == key && last.next == last) {
            last = null;
            return last;
        }

        Node temp = last, d = new Node();

        // if last is to be deleted
        if (last.data == key) {
            // find the node before the last node
            while (temp.next != last) {
                temp = temp.next;
            }

            // point temp node to the next of last i.e. first node
            temp.next = last.next;
            last = temp.next;
        }

        // travel to the node to be deleted
        while (temp.next != last && temp.next.data != key) {
            temp = temp.next;
        }

        // if node to be deleted was found
        if (temp.next.data == key) {
            d = temp.next;
            temp.next = d.next;
        }
        return last;
    }
    static void Display(Node last) {
        Node temp;

        if (last == null) {
            System.out.println("List is empty.");
            return;
        }

        temp = last.next;

        do {
            System.out.print(temp.data + " ");
            temp = temp.next;

        }
        while (temp != last.next);

    }

    public static void main(String[] args) {
        Node last=null;
        last=insertToEmpty(last,3);

    }


}
