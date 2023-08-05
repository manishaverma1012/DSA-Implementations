package Queue;

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
    QNode front, rear;
    public Queue()
    {
        this.front=null;
        this.rear=null;
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


    }
    public boolean isEmpty()
    {
        if(this.front==null || this.rear==null)
        {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

    }



}
