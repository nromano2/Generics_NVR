/**
 * This class models a Node object which contains a generic dataType. 
 * Each node has its internal data and pointers to the next 
 * node in the list.
 * 
 * @author rkelley/njohnson/nicholasromano
 * Programming Project 3
 * CS131 Spring 2023
 */

public class GenericNode<T> {
	private T data; //The generic type data that the object stores
	private GenericNode<T> nextNode; //pointer to the nextNode that will be in LinkedList
	
	/**
	 * Constructor build Node object. Initializes nextNode and data
	 * to null.
	 */
	public GenericNode()
	{
		setNextNode(null);
		data = null;
	}//end empty-argument constructor
	
	/**
	 * This method sets the generics data of the object.
	 * @param data
	 */
	public void setData(T data)
	{
		this.data = data;
	}//end setData
	
	/**
	 * This method returns the generic data of the object.
	 * @return data
	 */
	public T getData()
	{
		return this.data;
	}//end getData
	
	/**
	 * This method returns itself to the caller.
	 * @return
	 */
	public GenericNode<T> getNode()
	{
		return this;
	}//end getNode
	
	/**
	 * This method updates the pointer for the next generic node.
	 * @param nextNode
	 */
	public void setNextNode(GenericNode<T> nextNode)
	{
		this.nextNode = nextNode;
	}//end setNextNode
	
	/**
	 * This method returns the generic node stored in the next node pointer.
	 * @return Node object
	 */
	public GenericNode<T> getNextNode()
	{
		return nextNode;
	}//end getNextNode
}//end class
