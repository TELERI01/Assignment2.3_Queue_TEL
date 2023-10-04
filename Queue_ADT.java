
public class Queue_ADT<T> extends GenericLinkedList{

	/*
	 * Adds to the tail of the queue
	 */
	public void enqueue(GenericNode newEntry) {
		super.addNode(newEntry);
		System.out.println(newEntry.data + " has Arrived!");
	}
	/*
	 * Removes the head of the queue and returns the object
	 */
	public GenericNode dequeue() {
		super.remove();
		try {
			System.out.println("Another Customer has been served: " + this.head.data);
		}catch(Exception e) {
			System.out.println("The queue is empty!");
			
		}
		return head;
		
	}
	/*
	 * Get's the front element of the Queue
	 */
	public GenericNode getFront() {
		
		return super.head;
	}
	/*
	 * Returns a boolean statement
	 */
	public boolean isEmpty() {
		return super.isEmpty();
	}
	
	
	
}
