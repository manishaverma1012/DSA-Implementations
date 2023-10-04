package Stack;

import java.util.*;

public class Stack {
    private ArrayList<Integer> list;
    private int size;
    public Stack()
    {
        this.size=0;
        this.list=new ArrayList<>(size);

    }
    public void push(int data)
    {
        list.add(data);
        size++;

    }
    public int pop()
    {
        if(isEmpty())
        {
            return -1;
        }
        int val=peek();
        list.remove(size-1);
        size--;
        return val;

    }
    public boolean isEmpty()
    {
        if(size==0)
        {
            return true;
        }
        else {
            return false;
        }

    }
    public int peek()
    {
        int val=list.get(size-1);
        return val;

    }
    public void display()
    {
        for(int i=0;i<list.size();i++)
        {
            System.out.println(list.get(i));
        }
    }

    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(3);
        s.push(5);
        s.push(6);
        s.display();
        System.out.println(s.pop());
        System.out.println(s.peek());
        System.out.println(s.isEmpty());
    }

}
