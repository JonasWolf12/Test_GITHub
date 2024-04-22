package queue;

public class ArrayQueue {

	private int capacity; // generelle Größe
	private int front;
	private int rear;
	private int[] queue;

	public ArrayQueue(int capacity) {
		this.front = 0;
		this.rear = 0;
		this.capacity = capacity;
		this.queue = new int[capacity];
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getFront() {
		return front;
	}

	public void setFront(int front) {
		this.front = front;
	}

	public int getRear() {
		return rear;
	}

	public void setRear(int rear) {
		this.rear = rear;
	}

	public int[] getQueue() {
		return queue;
	}

	public void setQueue(int[] queue) {
		this.queue = queue;
	}

	public static void main(String[] args) {

	}
	
	
	/**
	 * Checks if the queue is empty.
	 * @return true if the queue is empty, false otherwise.
	 */
	public boolean isEmpty() {
	    if (front == rear) {
	        return true;
	    }
	    return false;
	}

	/**
	 * Checks if the queue is full.
	 * @return true if the queue is full, false otherwise.
	 */
	public boolean isFull() {
	    if (rear == capacity) {
	        return true;
	    }
	    return false;
	}

	/**
	 * Adds an element to the queue.
	 * @param element the element to be added to the queue.
	 */
	public void enqueue(int element) {
	    if (!isFull()) {
	        queue[rear] = element;
	        rear++;
	    } else {
	        System.out.println("Queue is full!");
	    }
	}

	/**
	 * Removes an element from the queue.
	 */
	public void dequeue() {
	    if (!isEmpty()) {
	        for (int i = 0; i < rear - 1; i++) {
	            queue[i] = queue[i + 1];
	        }
	        if (rear < capacity) {
	            queue[rear] = 0;
	        }
	        rear--;
	    } else {
	        System.out.println("Queue is empty!");
	    }
	}

	/**
	 * Returns the element at the front of the queue.
	 * @return the element at the front of the queue, or -1 if the queue is empty.
	 */
	public int front() {
	    if (!isEmpty()) {
	        return queue[front];
	    }
	    return -1; // Not a clean solution -> Exception Handling
	}

	/**
	 * Displays all elements in the queue.
	 */
	public void display() {
	    if (!isEmpty()) {
	        for (int i = 0; i < rear - 1; i++) {
	            System.out.println(queue[i]);
	        }
	    } else {
	        System.out.println("Queue is empty!");
	    }
	}
}
