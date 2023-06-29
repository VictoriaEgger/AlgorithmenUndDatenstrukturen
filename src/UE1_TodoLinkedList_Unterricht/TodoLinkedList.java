package UE1_TodoLinkedList_Unterricht;

public class TodoLinkedList {
    // *** Membervariablen ***
    private Node first;
    private Node last;

    // *** Get-Methoden (Set-Methoden nicht notwendig) ***

    public Node getFirst() {
        return first;
    }

    public Node getLast() {
        return last;
    }

    // *** Operationen ***

    public void appendTodoText(String todoText) {
        // Node erstellen
        Node newNode = new Node();
        newNode.setTodoText(todoText);

        // 1. Durchlauf --> todoText = "Kochen"
        // 2. Durchlauf --> todoText = "Essen"
        // 3. Durchlauf --> todoText = "Spülen"

        // Fall 1: Liste ist leer
        if (first == null)
        {
            first = newNode;
            last = newNode;
        }
        // Fall 2: Liste ist NICHT leer
        else {
            last.setNext(newNode);
            last = newNode;
        }
    }

    public void deleteLastTodoText() {
        // Fall 3: Liste hat genau 1 Element oder ist leer
        if (first == last)
        {
            first = null;
            last = null;
        }
        else
        {
            // Fall 1: Liste hat mehr als 1 Element
            // ===
            // Vorletztes Element finden
            Node current = first;
            // Weiterspringen, bis vorletztes Element gefunden wurde
            while (current.getNext() != last)
            {
                // Um einen Knoten weiterspringen
                current = current.getNext();
            }

            // Referenzen anpassen
            last = current;
            current.setNext(null);
        }


    }

    public String getTodoTextAtIndex(int index) {
        // TODO: Implementierung vervollständigen
        return null;
    }
}
