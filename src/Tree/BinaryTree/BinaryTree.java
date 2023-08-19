package Tree.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

class BT
{
    static int idx=-1; //this will use for indexing part;
    public static BinaryTree.Node buildTree(int nodes[])
    {
        idx++;
        if(nodes[idx]==-1)
        {
            return null;
        }
        BinaryTree.Node newNode=new BinaryTree.Node(nodes[idx]);
        newNode.left=buildTree(nodes);
        newNode.right=buildTree(nodes);
        return newNode;
    }
    public static void preOrderTraversal(BinaryTree.Node root)
    {
        if(root==null)
        {
            return;
        }
        System.out.println(root.data+ " ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);


    }
    public static void InOrderTraversal(BinaryTree.Node root)
    {
        if(root==null)
        {
            return;
        }
        InOrderTraversal(root.left);
        System.out.println(root.data+" ");
        InOrderTraversal(root.right);
    }
    public static void PostOrderTraversal(BinaryTree.Node root)
    {
        if(root==null)
        {
            return;
        }
        InOrderTraversal(root.left);
        InOrderTraversal(root.right);
        System.out.println(root.data+" ");
    }
    public static void LevelOrderTraversal(BinaryTree.Node root)
    {
        //queue data structure and iterating
        //BFS
        if(root==null)
        {
            return;
        }
        Queue<BinaryTree.Node> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty())
        {
            BinaryTree.Node currNode=q.remove();
            if(currNode==null)
            {
                System.out.println();
                if(q.isEmpty())
                {
                    break;
                }
                else {
                    q.add(null);
                }

            }
            else {
                System.out.println(currNode.data+ " ");
                if(currNode.left!=null)
                {
                    q.add(currNode.left);
                }
                if(currNode.right!=null)
                {
                    q.add(currNode.right);
                }

            }

        }

    }
}

public class BinaryTree {
    static class Node
    {
        int data;
        Node left;
        Node right;
        Node(int data)
        {
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BT tree=new BT();
        Node root=tree.buildTree(nodes);
        tree.LevelOrderTraversal(root);

    }
}
