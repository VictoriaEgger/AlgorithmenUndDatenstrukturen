package Demo01_BinaryTree;

public class Main {

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.add(25);
        tree.add(14);
        tree.add(40);
        tree.add(7);

        Node searchNode1 = tree.search(7);
        System.out.println(searchNode1.getNumber());

        Node searchNode2 = tree.search(5);
        if (searchNode2 == null)
            System.out.println("searchNode2 ist null");
    }
}
