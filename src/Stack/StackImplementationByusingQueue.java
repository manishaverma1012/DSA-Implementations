package Stack;

import java.util.*;

public class StackImplementationByusingQueue {
    static class Stack{
        static Queue<Integer> q1=new LinkedList<>();
        static Queue<Integer> q2=new LinkedList<>();
        static int currsize=0;
        static void push(int x)
        {
            q1.add(x);
            while(!q2.isEmpty())
            {
                q1.add(q2.peek());
                q2.remove();
            }
            Queue<Integer> q=q2;
            q2=q1;
            q1=q;
            currsize++;

        }
        static int pop()
        {
            if(!q2.isEmpty())
            {
                return 0;
            }
            currsize--;
            return q2.remove();


        }
        static int Peek()
        {
            return q2.peek();

        }
        static boolean isEmpty()
        {
            if(!q2.isEmpty())
            {
                return true;
            }
            return false;

        }
        static int size()
        {
            return currsize;
        }

    }

    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(6);
        s.push(4);
        s.push(8);
//        s.pop();
        System.out.println(s.pop());
//        System.out.println(s.Peek());


    }
}
