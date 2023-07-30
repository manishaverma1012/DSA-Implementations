package Linkedlist;

public class LinkedList {
    private Node head;
    private Node tail;
    private int size;
    LinkedList()
    {
        this.size=0;

    }
    private class Node
    {
        private int data;
        private Node next;
        public Node(int data)
        {
            this.data=data;

        }
        public Node(int data, Node next)
        {
            this.data=data;
            this.next=next;
        }
    }


    public void addFirst(int x)
    {
        Node newnode=new Node(x);
        newnode.next=head;
        head=newnode;
        if(tail==null)
        {
            tail=head;
        }
        size++;
    }
    public void addLast(int x1)
    {
        Node node=new Node(x1);
        if(tail==null)
        {
            addFirst(x1);
            return;

        }
        tail.next=node;
        tail=node;
        size++;

    }
    public  int getsize()
    {
        return size;

    }
    public  int deleteLast()
    {
        if(size<=1)
        {
            return deleteFirst();
        }
        Node secondlast=getnode(size-2);
        int val=tail.data;
        tail=secondlast;
        tail.next=null;
        size--;
        return val;


    }
    public int deleteFirst()
    {
        int val=head.data;
        head=head.next;
        if(head==null)
        {
            tail=null;
        }
        size--;
        return val;


    }
    public  void display()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data + "->");
            temp=temp.next;
        }
        System.out.println("Null");
    }
    public Node getnode(int index)
    {
        Node node=head;
        for(int i=0;i<index;i++)
        {
            node=node.next;
        }
        return node;
    }
    public Node findval(int value)
    {
        Node node=head;
        while(node!=null)
        {
            if(node.data==value)
            {
                return node;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        LinkedList l=new LinkedList();
        l.display();
        l.addFirst(3);
        l.display();
        l.addLast(4);
        l.addLast(5);
        l.display();
        System.out.println(l.deleteLast());
        l.display();
        l.deleteFirst();
        l.display();
        System.out.println(l.getsize());






    }
}
