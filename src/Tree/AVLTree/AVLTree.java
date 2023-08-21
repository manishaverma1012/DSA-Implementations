package Tree.AVLTree;
import java.util.*;
class Node
{
    int key,height;
    Node left,right;
    Node(int data)
    {
        key=data;
        height=1;
    }

}

public class AVLTree {
    Node root;
    int height(Node N)// utility function to get a height of a tree
    {
        if(N==null)
        {
            return 0;
        }
        return N.height;
    }
    //find max of 2 integers
    int max(int a,int b)
    {
        return (a>b)?a:b;
    }
    int getBalance(Node N)
    {
        if(N==null)
        {
            return 0;
        }
        return height(N.left)-height(N.right);
    }
    Node rightRotate(Node y)
    {
        Node x=y.left;
        Node t2=x.right;

        x.right=y;
        y.left=t2;

        y.height=max(height(y.left),height(y.right))+1;
        x.height=max(height(x.left),height(x.right))+1;


        return x;
    }
    Node leftRotate(Node x)
    {
        Node y=x.right;
        Node T2=y.left;

        //rotation
        y.left=x;
        x.right=T2;

        //update the heights
        x.height=max(height(x.left),height(x.right))+1;
        y.height=max(height(y.left),height(y.right))+1;

        return y;



    }


    Node insert(Node node, int key)
    {
        // normal BST operation
        if(node==null)
        {
            return (new Node(key));
        }
        if(key<node.key)
        {
            node.left=insert(node.left,key);
        }
        else if(key>node.key)
        {
            node.right=insert(node.right,key);
        }
        else {//duplicate keys not allowed
            return node;
        }
        node.height=1+(max(height(node.left),height(node.right)));
        int balance=getBalance(node);
        //LL right rotation only
        if(balance>1 && key<node.left.key)
        {
            return rightRotate(node);
        }
        // RR left rotation only
        if(balance<-1 && key >node.right.key)
        {
            return leftRotate(node);
        }
        // left right case LR left rotation first and then right rotation
        if(balance>1 && key>node.left.key)
        {
            node.left=leftRotate(node.left);
            return rightRotate(node);

        }
        //right left case RL right rotation first and then left roation
        if(balance<-1 && key<node.right.key)
        {
            node.right=rightRotate(node.right);
            return leftRotate(node);

        }
        return node;

    }
    Node InorderSuccesser(Node node)
    {
        Node temp=node;
        while(temp.left!=null)
        {
            temp=temp.left;
        }
        return temp;
    }
    Node delete(Node node, int key)
    {
        if(node==null)
        {
            return null;
        }
        if(key<node.key)
        {
            node.left=delete(node.left,key);

        }
        else if(key> root.key)
        {
            node.right=delete(node.right,key);
        }
        else {
            // no children
            if(node.left==null && node.right==null)
            {
                return null;
            }

            // one children
            else if(node.left==null) {
                return root.right;
            } else if (root.right==null) {
                return root.left;
            }

            //two children
            Node IS=InorderSuccesser(node.right);
            node.key=IS.key;
            node.right=delete(node.right,IS.key);

        }
        if(node==null)
        {
            return node;
        }
        node.height = max(height(node.left), height(node.right)) + 1;
        int balance = getBalance(node);
        //LL
        if(balance >1 && getBalance(node.left)>=0)
        {
            return rightRotate(node);
        }
        //LR
        if(balance >1 && getBalance(node.left)<0)
        {
            node.left=leftRotate(node.left);

            return rightRotate(node);
        }
        //RR
        if(balance <-1 && getBalance(node.right)<=0)
        {
            return leftRotate(node);
        }
        //RL
        if(balance <-1 && getBalance(node.right)>0)
        {
            node.right=rightRotate(node.right);
            return leftRotate(node);
        }
        return node;


    }
    public void preorder(Node node)
    {
        if(node ==null)
        {
            return;
        }
        System.out.println(node.key +" ");
        preorder(node.left);
        preorder(node.right);
    }
    public static void main(String[] args) {
        AVLTree tree = new AVLTree();

        /* Constructing tree given in the above figure */
        tree.root = tree.insert(tree.root, 10);
        tree.root = tree.insert(tree.root, 20);
        tree.root = tree.insert(tree.root, 30);
        tree.root = tree.insert(tree.root, 40);
        tree.root = tree.insert(tree.root, 50);
        tree.root = tree.insert(tree.root, 25);

//        tree.preorder(tree.root);
//        tree.root=tree.delete(tree.root,10);
        tree.root=tree.delete(tree.root,20);
        tree.preorder(tree.root);
    }

}
