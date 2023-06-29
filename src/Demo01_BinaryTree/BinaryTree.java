package Demo01_BinaryTree;

public class BinaryTree {
    private Node root;

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public void add(int number)
    {
        // Node-Objekt erzeugen
        Node newNode = new Node();
        newNode.setNumber(number);

        // Fall: Baum ist leer
        if (root == null)
        {
            root = newNode;
        }
        // Fall: Baum ist nicht leer
        else {
            Node current = root;
            boolean nodeAdded = false;
            while (nodeAdded == false)
            {
                if (newNode.getNumber() < current.getNumber()) {
                    // Linkes Kind existiert nicht - hier kann neuer Knoten eingefügt werden.
                    if (current.getLeft() == null) {
                        current.setLeft(newNode);
                        nodeAdded = true;
                    }
                    // Sonst beim linken Knoten weitersuchen
                    else
                        current = current.getLeft();
                }
                else {
                    // Rechtes Kind existiert nicht - hier kann neuer Knoten eingefügt werden
                    if (current.getRight() == null) {
                        current.setRight(newNode);
                        nodeAdded = true;
                    }
                    else
                        current = current.getRight();
                }
            }
        }
    }

    public Node search(int number)
    {
        Node current = root;
        while (current != null)
        {
            // Knoten gefunden
            if (current.getNumber() == number)
                return current;
            // Gesuchter Wert kleiner als aktueller Knoten, dann links weitergehen
            else if (number < current.getNumber()) {
                current = current.getLeft();
            // Gesuchter Wert größer als aktueller Knoten, dann rechts weitergehen
            } else {
                current = current.getRight();
            }
        }
        // Wert nicht gefunden
        return null;
    }


}
