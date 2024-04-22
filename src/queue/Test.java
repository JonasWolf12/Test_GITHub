package queue;

public class Test {
    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(5);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(50);


        System.out.println("enqueuing:");
        queue.display();

        System.out.println("Front element: " + queue.front());

        queue.dequeue();

        System.out.println("dequeuing:");
        queue.display();
    }
}
