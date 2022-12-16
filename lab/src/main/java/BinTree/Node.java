package BinTree;

public class Node { //класс узлов
    public int a; // элемент который добавляем
    public Node left;
    public Node right;


    Node(int a){
        this.a = a;
        right = null;
        left = null;
    }
}