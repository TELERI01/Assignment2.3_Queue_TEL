/**
 * 
 * @author tylerlericos
 *
 */
public class GenericLinkedList<T> {
	GenericNode head;
	int length;
	GenericNode tail;
	
	/**
	 * 
	 */
	public GenericLinkedList()
	{
		head=null;
		length=0;
		tail=head;
	}
	/**
	 * 
	 * @return
	 */
	public boolean isEmpty()
	{
		if (head==null) { return true;}
		else return false;
	}
	/**
	 * 
	 * @return
	 */
	public GenericNode getList()
	{
		return head;
	}
	/**
	 * 
	 * @param aNode
	 */
	public void addNode(GenericNode aNode)
	{
		if (isEmpty() ) {
			head = aNode;
			tail=head;
			return;
		}
		tail.nextGnode=aNode;
		tail=tail.nextGnode;
		tail.nextGnode=null;
		length++;
		
	}
	public GenericNode remove() {
        

        GenericNode temp;
        temp = head;
        
        head = head.nextGnode;
        
        
        
        length--;
        return temp;
    }
	
	 
}
