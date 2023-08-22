package Linkedlist;
class Node
{
    int data;
    Node next;
    Node prev;
    public Node(int data)
    {
        this.data=data;
    }
}

public class DLL {
    Node head;
    Node tail;
    public void insertAtFirst(int data)
    {
        Node new_Node = new Node(data);
        new_Node.next=head;
        new_Node.prev=null;
        if(head!=null)
        {
            head.prev=new_Node;
        }
        head=new_Node;

    }
    public void deleteAtFirst()
    {
        if(head==null)
        {
            System.out.println("list is empty");
            return;
        }
        if(head.next==null)
        {
            head=null;
            System.out.println("last element deleted");
            return;
        }
        Node temp=head.next;
        head.next=null;
        temp.prev=null;
        head=temp;

    }
    public void insertAtLast(int data)
    {
        if(head==null)
        {

            insertAtFirst(data);
            return;
        }
        Node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        Node newNode=new Node(data);
        newNode.next=null;
        temp.next=newNode;
        newNode.prev=temp;


    }
    public void deleteAtLast()
    {
        if(head==null)
        {
            return;
        }
        if(head.next==null)
        {
            deleteAtFirst();
            return;
        }
        Node temp1=head;
        Node temp2=head.next;
        while(temp2.next!=null)
        {
            temp1=temp1.next;
            temp2=temp2.next;
        }
        temp2.prev=null;
        temp1.next=null;

    }
    public void insertBefore(Node next_Node,int data)
    {
        if(next_Node==null)
        {
            System.out.println("can't add");
            return;
        }
        Node newNode=new Node(data);
        newNode.prev=next_Node.prev;
        next_Node.prev=newNode;
        newNode.next=next_Node;
        if (newNode.prev != null)
            newNode.prev.next = newNode;
        else
            head = newNode;

    }
    public void insertAfter(Node prev_Node,int data)
    {
        if(prev_Node==null)
        {
            System.out.println("can't add");
            return;

        }
        Node newNode=new Node(data);
        newNode.next=prev_Node.next;
        prev_Node.next=newNode;
        newNode.prev=prev_Node;
        if (newNode.next != null)
            newNode.next.prev = newNode;

    }
    public void delete()
    {

    }
    public void display()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.println(temp.data+" ");
            temp=temp.next;
        }

    }

    public static void main(String[] args) {
        DLL doublylinkedlist=new DLL();
        doublylinkedlist.insertAtFirst(4);
        doublylinkedlist.insertAtFirst(5);
        doublylinkedlist.insertAtLast(7);
        doublylinkedlist.deleteAtLast();
        doublylinkedlist.deleteAtLast();
        doublylinkedlist.deleteAtLast();
//        doublylinkedlist.deleteAtFirst();
//        doublylinkedlist.deleteAtFirst();

        doublylinkedlist.display();
    }

}
