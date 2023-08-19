package Tree.N_ArrayTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class TreeNode<T>
{
    public T data;
    public ArrayList<TreeNode<T>> children;
    TreeNode(T data)
    {
        this.data=data;
        children= new ArrayList<>();
    }
}
public class NArrayTree<T> {
    TreeNode<T> root;
    public NArrayTree(T NArrayData)
    {
        root=new TreeNode<>(NArrayData);
    }
    public void addChild(TreeNode<T> root,T data)
    {

            TreeNode<T> newNode=new TreeNode<>(data);
            root.children.add(newNode);




    }
    public void printNAryTree(TreeNode<T> node){
        if(root == null) return;
        Queue<TreeNode<T>> queue = new LinkedList<>();
        queue.offer(node);
        while(!queue.isEmpty()) {
            int len = queue.size();
            for(int i=0;i<len;i++) {
                TreeNode<T> node1 = queue.poll();
                if (node1 == null) throw new AssertionError();
                System.out.print(node1.data + " ");
                for (TreeNode<T> item : node1.children) {
                    queue.offer(item);
                }
            }
            System.out.println();
        }
    }
   //recursive method to print tree
    public void PrintTree(TreeNode<T> node,String prefix, boolean isTail)
    {

        System.out.println(prefix+(isTail?"L__":"|---")+node.data);
        for(int i=0;i<node.children.size()-1;i++)
        {
            PrintTree(node.children.get(i),prefix+(isTail?" ":"| "), false);

        }
        if(node.children.size()>0)
        {
            PrintTree(node.children.get(node.children.size()-1),prefix+(isTail?" ":"| "),true);
        }

    }
    public void Display()
    {
        PrintTree(root," ",true);


    }

    public static void main(String[] args) {
        NArrayTree<String> tree = new NArrayTree<>("Root");
        TreeNode<String> root = tree.root;
        tree.addChild(root, "Child1");
        tree.addChild(root, "Child2");
        tree.addChild(root, "Child3");
        tree.Display();

        TreeNode<String> child1=root.children.get(0);
        tree.addChild(child1,"child1.1");
        tree.addChild(child1,"child1.2");
        tree.addChild(child1,"child1.3");

        TreeNode<String> child2=root.children.get(1);
        tree.addChild(child2,"child2.1");
        TreeNode<String> child3=root.children.get(2);
        tree.addChild(child3,"child3.1");
        tree.addChild(child3,"child3.2");
        tree.addChild(child3,"child3.3");

        tree.Display();
        tree.printNAryTree(root);



    }

}
