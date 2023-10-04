/*
 * tlericos
 * Johnson
 * CS215
 * Assingment 2
 */
public class GenericNode<T> {

	T data;
	GenericNode nextGnode;
	
	/**
	 * GenericsNode Main method, sets variables to null 
	 */
	public GenericNode() {
		nextGnode = null;
		data = null;
	}
    /**
     * Getter for T data
     * @return value stored in data
     */
	public T getData() {
		return data;
	}
    /**
     * 
     * @param data
     */
	public void setData(T data) {
		this.data = data;
	}
    /**
     * Getter for next node
     * @return value in nextGnode
     */
	public GenericNode getNextGnode() {
		return nextGnode;
	}
    /**
     * sets nextNode
     * @param nextGnode
     */
	public void setNextGnode(GenericNode nextGnode) {
		this.nextGnode = nextGnode;
	}
	
	
	
	
}

