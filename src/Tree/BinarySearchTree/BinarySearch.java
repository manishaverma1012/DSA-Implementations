package Tree.BinarySearchTree;
public class BinarySearch {
    static class Node {
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data = data;
        }
    }
        public static Node insert(Node root, int val)
        {
            if(root==null)
            {
                root=new Node(val);
                return root;
            }
            if(root.data>val)
            {
                root.left=insert(root.left,val);

            }
            else {
                root.right=insert(root.right,val);
            }
            return root;


        }
        public static void inorder(Node root)
        {
            if(root==null)
            {
                return;
            }
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
        public static boolean search(Node root, int key)
        {
            if(root==null)
            {
                return false;
            }
            if(root.data<key)
            {
                return search(root.right,key);

            }
            else if(root.data==key)
            {
                return true;
            }
            else {
                return search(root.left,key);

            }


        }
        public static Node delete(Node root, int val)
        {
            if(root.data>val)
            {
                root.left=delete(root.left,val);

            }
            else if(root.data <val)
            {
                root.right=delete(root.right,val);
            }
            else {
                //case1 | No children
                if(root.left==null && root.right==null)
                {
                    return null;
                }
                //case 2 | 1 children
                else if(root.left==null) {
                    return root.right;
                } else if (root.right==null) {
                    return root.left;

                }

                    Node IS=InorderSuccessor(root.right);
                    root.data=IS.data;
                    root.right=delete(root.right,IS.data);



            }
            return root;
        }
        //leftmost node in our right subtree;
        public static Node InorderSuccessor(Node root)
        {
            while(root.left!=null)
            {
                root=root.left;
            }
            return root;
        }


    public static void main(String[] args) {
        int values[]={5,1,3,4,7,2,9,12, 10, 15, 14};
        Node root=null;
        for(int i=0;i<values.length;i++)
        {
            root=insert(root,values[i]);
        }
        inorder(root);
        System.out.println();
        delete(root,12);
        inorder(root);
    }
}
