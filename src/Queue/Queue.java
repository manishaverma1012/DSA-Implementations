package Queue;

import java.io.IOException;
import java.sql.SQLOutput;

class QNode{
    int key;
    QNode next;
    public QNode(int key)
    {
        this.key=key;
        this.next=null;
    }
}

public class Queue {
    int size;
    QNode front, rear;
    public Queue()
    {
        this.front=null;
        this.rear=null;
        this.size=0;
    }
    void enqueue(int key)
    {
        QNode newnode=new QNode(key);
        if(this.rear==null)
        {
            this.front=this.rear=newnode;
            return;
        }
        this.rear.next=newnode;
        this.rear=newnode;
        size++;
    }
    void dequeue()
    {
        if(this.front==null)
        {
            return;
        }
        QNode temp=this.front;
        this.front=this.front.next;
        if(this.front==null)
        {
            this.rear=null;
        }
        size--;


    }
    public boolean isEmpty()
    {
        if(this.front==null || this.rear==null)
        {
            return true;
        }
        return false;
    }
    public void display()
    {
        if(this.front==null || this.rear ==null)
        {
            System.out.println("queue is empty");
            return;
        }
        QNode temp=this.front;
        while(temp!=this.rear.next)
        {
            System.out.println(temp.key);
            temp=temp.next;

        }

    }
    public void Size()
    {

        System.out.println(size);
    }

    public static void main(String[] args) {
        Queue queue=new Queue();
        queue.enqueue(2);
        queue.enqueue(5);
        queue.dequeue();
        queue.display();
//        System.out.println(queue.isEmpty());
//        queue.Size();

    }



}
