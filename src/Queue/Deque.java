package Queue;
//implementation of deque by using circular array;
// we can implement by using doubly linkedlist as well
//https://www.geeksforgeeks.org/implementation-deque-using-circular-array/
public class Deque {
    static final int max =1000;
    int arr[];
    int front;
    int rear;
    int size;
    public Deque(int size)
    {
        arr=new int[max];
        front=-1;
        rear=0;
        this.size=size;
    }
    public boolean isFull()
    {
        if(front==0 && rear==size-1 || front==rear+1)
        {
            return true;

        }
        return false;

    }
    public boolean isEmpty()
    {
        return (front==-1);

    }
    public void addFront(int key)
    {
        if (isFull()) {
            System.out.println("Overflow");
            return;
        }
        if(front==-1)
        {
            front=0;
            rear=0;

        }
        else if(front==0)
        {
            front=size-1;
        }
        else {
            front =front-1;

        }
        arr[front]=key;






    }
    public void addLast(int key)
    {
        if(isFull())
        {
            System.out.println("can not insert it");
            return;
        }
        if(front==-1)
        {
            front=0;
            rear=0;
        }
        else if( rear==size-1)
        {
            rear=0;
        }
        else {
            rear=rear+1;
        }
        arr[rear]=key;

    }
    public void deleteFront()
    {
        if (isEmpty()) {
            System.out.println("Queue Underflow\n");
            return;
        }
        // Deque has only one element
        if (front == rear) {
            front = -1;
            rear = -1;
        }

            // back to initial position
        else if (front == size - 1)
        {
                front = 0;
        }

            else
        {
            front = front + 1;
        }


            // increment front by '1' to remove current

                // front value from Deque

    }
    public void deleteLast()
    {
        if (isEmpty()) {
            System.out.println("Queue Underflow\n");
            return;
        }
        // Deque has only one element
        if (front == rear) {
            front = -1;
            rear = -1;
        }
        else if(rear==0)
        {
            rear=size-1;

        }
        else {
            rear=rear-1;

        }

    }
    public int getFront()
    {
        if (isEmpty()) {
            System.out.println(" Underflow");
            return -1;
        }
        return arr[front];

    }
    public int getLast()
    {
        if (isEmpty() || rear < 0) {
            System.out.println(" Underflow\n");
            return -1;
        }
        return arr[rear];

    }

    public static void main(String[] args) {
        Deque dq=new Deque(7);
    }


}
