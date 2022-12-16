package BinTree;

public class Tree {
    Node root; // инициализация корня типа узел
    public void add(int a){
        root = addToTree(root,a);
    }
    public void createBinaryTree() {

        add(1);
        add(2);
        add(3);
        add(4);
        add(5);
        add(6);
        add(7);

    }
    public Node addToTree(Node current, int a){
        if (current == null){ // если текущее 0, возвращениет узел
            return new Node(a);
        }
        if (a < current.a){
            current.left = addToTree(current.left,a); // меньше текущего

        } else if (a > current.a){
            current.right = addToTree(current.right,a); // больше текущего
        } else {
            return current;
        }
        return current;
    }

    public void printNode(Node node){
        if (node != null){
            System.out.println(node.a);
            printNode(node.left);
            printNode(node.right);

        }
    }
    public void printTree(){
        printNode(root);
    }
}