package Tree.N_ArrayTree;

import java.util.ArrayList;

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
        if(root==null)
        {
            root=new TreeNode<T>(data);
            return;
        }

            TreeNode<T> newNode=new TreeNode<>(data);
            root.children.add(newNode);




    }

    public void PrintTree()
    {

    }

    public static void main(String[] args) {

    }

}
