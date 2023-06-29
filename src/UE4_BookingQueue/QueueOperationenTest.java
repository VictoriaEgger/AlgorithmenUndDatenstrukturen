package UE4_BookingQueue;

import UE3_BookStack.Node;

public class QueueOperationenTest {

    Node front;
    Node rear;

    public Node getFront() {
        return front;
    }

    public void setFront(Node front) {
        this.front = front;
    }

    public Node getRear() {
        return rear;
    }

    public void setRear(Node rear) {
        this.rear = rear;
    }

    public int getCount(){
        Node current = front;
        int counter = 0;

        if (current == null){
            return 0;
        }

        while (current.getNext() != null){
            current=current.getNext();
            counter++;
        }
        return counter;
    }
    public void enqueue(Booking newBooking){
        Node newNode = new Node(newBooking);

        if (front == null){
            front = newNode;
            rear = newNode;
        }
        else {
            rear.setNext(newNode);
            rear= newNode;

        }

    }

    public void dequeue() throws QueueEmptyException{
        if (front == null){

            throw new QueueEmptyException();
        }
        else {
            
        }
    }
}
