package Tree.BinaryTree;

import javax.print.attribute.IntegerSyntax;
import java.util.ArrayList;
import java.util.List;
//right view vice versa
public class LeftView {
    static int maxLevel = 0;

    public static List<Integer> printLeftView(BinaryTree.Node root) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        printLeftViewUtil(root, arrayList, 1);

        return arrayList;


    }

    public static void printLeftViewUtil(BinaryTree.Node root, ArrayList<Integer> arrayList, int level)  {
       if(root == null) {
           return;
       }

       if(level > maxLevel) {
           maxLevel = level;
           arrayList.add(root.data);
       }

       printLeftViewUtil(root.left, arrayList, level+1);
       printLeftViewUtil(root.right, arrayList, level+1);
    }
    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BT tree = new BT();
        BinaryTree.Node root = tree.buildTree(nodes);

        printLeftView(root);
        System.out.println(root.data);
    }
}
