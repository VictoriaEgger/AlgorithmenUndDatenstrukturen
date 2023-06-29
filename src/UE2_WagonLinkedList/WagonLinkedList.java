package UE2_WagonLinkedList;

public class WagonLinkedList {
    // *** Membervariablen ***
    Node first;
    Node last;

    // *** Methoden ***


    public Node getFirst() {
        return first;
    }



    public Node getLast() {
        return last;
    }


    void insertWagonAtFirstPos(String wagonId) {
        Node newNode = new Node();

        if (first == null){
            first = newNode;
            last = newNode;
        }
        else {
            first.setNext(newNode);
            first.setNext(newNode);
            first = newNode;
        }
    }

    void removeWagonFromLastPos() {
        if (last == null){
            return;
        }
        if (first == last){
            first = null;
            last= null;
        }
        else {
            last.getPrev().setNext(null);
            last= last.getPrev();
            }
        }


    void printList() {
        System.out.print("* List: ");

        if (this.getFirst() == null) {
            System.out.print("<empty>");
        } else {
            Node currentNode = this.getFirst();
            while (currentNode != null) {
                System.out.print(currentNode.getWagonId() + ", ");
                currentNode = currentNode.getNext();
            }
        }

        System.out.println();
    }
}
