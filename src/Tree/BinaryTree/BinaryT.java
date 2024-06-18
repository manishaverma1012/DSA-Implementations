package Tree.BinaryTree;
import java.util.Scanner;
public class BinaryT {
    static Scanner sc = null;
    public static void main(String[] args) {
        sc = new Scanner(System.in);

        Node root = createTree();
        System.out.println(root.data);
    }

    static Node createTree() {

        Node root = null;
        System.out.print("Enter the data: ");

        int data = sc.nextInt();

        if(data == -1) {
            return null;
        }

        root = new Node(data);

        System.out.println("Enter left for" + data);

        root.left = createTree();

        System.out.println("Enter the right data" + data);
        root.right = createTree();

        return root;
    }
}

class Node {
    Node left, right;
    int data;

    public Node(int data) {
        this.data = data;
    }
}
