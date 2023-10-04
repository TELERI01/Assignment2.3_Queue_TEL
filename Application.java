/**
 * Dr. johnson
 * @author tylerlericos
 * CS215
 */
public class Application {

	public static void main(String args[]) {
		
		/*
		 * INSTANTIATIONS
		 */
		GenericLinkedList glist = new GenericLinkedList();
		Queue_ADT queue = new Queue_ADT();
		
		
		//Instantiating generic nodes
		GenericNode bill  = new GenericNode();
		GenericNode alice  = new GenericNode();
		GenericNode bob = new GenericNode();
		GenericNode jane = new GenericNode();
		GenericNode hamad = new GenericNode();
		GenericNode jim = new GenericNode();
		
		
		//Setting the data for each of the nodes
		bill.setData("Bill");
		alice.setData("Alice");
		bob.setData("Bob");
		jane.setData("Jane");
		hamad.setData("Hamad");
		jim.setData("Jim");
		
		
		//===============================
		//Testing the Queue
		//===============================
		System.out.println("====VegeBurgers Palace====");
		
		//Enquing the line
		System.out.println("\nEnqueue the first three people: ");
		queue.enqueue(bill);
		queue.enqueue(alice);
		queue.enqueue(bob);
		
		//
		System.out.println("\n");
		queue.dequeue();
		queue.dequeue();		
		//Enqueue Jane and Hamad into the line
		System.out.println("\n");
		queue.enqueue(jane);
		queue.enqueue(hamad);
		System.out.println("\n");
		//Dequeue the last two
		queue.dequeue();
		queue.dequeue();
		
		System.out.println("\nDone!");
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
}
