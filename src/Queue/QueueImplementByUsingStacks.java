package Queue;

import java.util.Stack;

public class QueueImplementByUsingStacks {
    static class Queue
    {
        static Stack<Integer> s1=new Stack<>();
        static Stack<Integer> s2=new Stack<>();
        public static void enqueue(int data)
        {

            while(!s1.isEmpty())
            {
                s2.push(s1.pop());
            }
            s1.push(data);
            while(!s2.isEmpty())
            {
                s1.push(s2.pop());
            }
        }
        public static int dequeue()
        {
            if(s1.isEmpty())
            {
                return -1;
            }
            int x=s1.peek();
            s1.pop();
            return x;

        }
        public static int peek()
        {
            return s1.peek();
        }
        public static boolean isEmpty()
        {
            if(s1.isEmpty())
            {
                return true;
            }
            return false;
        }

    }

    public static void main(String[] args) {
        Queue q=new Queue();
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(6);
        q.enqueue(5);
        System.out.println(q.dequeue());




    }

}
