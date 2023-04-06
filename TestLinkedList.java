/**
 * @author nicholasromano
 * @version 1.0
 * Programming Project 3
 * CS131 Spring 2023
 */

public class TestLinkedList {
	public static void main(String[] args) {
		
		GenericLinkedList<String> myList=new GenericLinkedList<>();
		GenericNode<String> aNode=new GenericNode<String>();
		aNode.setData("Element 1");
		myList.addNode(aNode);
		aNode = new GenericNode<String>();
		aNode.setData("Element 2");
		myList.addNode(aNode);
		
		GenericNode<String> tempnode=myList.getList();
		do 
		{
			System.out.println(tempnode.getData());
			tempnode=tempnode.getNextNode();
		} while (tempnode!=null);
		
		
		
		GenericLinkedList<Integer> integerList = new GenericLinkedList<>();		
		GenericNode<Integer> integerNode = new GenericNode<Integer>();
		integerNode.setData(37);
		integerList.addNode(integerNode);
		
		integerNode = new GenericNode<Integer>();
		integerNode.setData(12);
		integerList.addNode(integerNode);
		
		integerNode = new GenericNode<Integer>();
		integerNode.setData(59);
		integerList.addNode(integerNode);
		
		GenericNode<Integer> IntNode = integerList.getList(); //sets IntNode variable to head node of the linkedlist
		do 
		{
			System.out.println(IntNode.getData()); //prints current node
			IntNode = IntNode.getNextNode(); //sets IntNode to the next Node
		} while (IntNode!=null); //checks to see if the nextNode is null, stops if it is null, continues if an Integer object
		
		
		GenericLinkedList<Double> doubleList = new GenericLinkedList<>();
		GenericNode<Double> doubleNode = new GenericNode<Double>();
		doubleNode.setData(73.25);
		doubleList.addNode(doubleNode);
		
		doubleNode = new GenericNode<Double>();
		doubleNode.setData(21.50);
		doubleList.addNode(doubleNode);
		
		doubleNode = new GenericNode<Double>();
		doubleNode.setData(95.75);
		doubleList.addNode(doubleNode);
		
		GenericNode<Double> DbleNode = doubleList.getList(); //sets DbleNode variable to head node of the linkedlist
		do 
		{
			System.out.println(DbleNode.getData()); //prints current node
			DbleNode = DbleNode.getNextNode(); //sets DbleNode to the next Node
		} while (DbleNode!=null); //checks to see if the nextNode is null, stops if it is null, continues if an Double object
		
		
		GenericLinkedList<String> stringList = new GenericLinkedList<>();
		GenericNode<String> stringNode = new GenericNode<String>();
		stringNode.setData("Nick Romano");
		stringList.addNode(stringNode);
		
		stringNode = new GenericNode<String>();
		stringNode.setData("Programming Project 3");
		stringList.addNode(stringNode);
		
		stringNode = new GenericNode<String>();
		stringNode.setData("CS131 Spring 2023");
		stringList.addNode(stringNode);
		
		GenericNode<String> StrNode = stringList.getList(); //sets StrNode variable to head node of the linkedlist
		do 
		{
			System.out.println(StrNode.getData()); //prints current node
			StrNode = StrNode.getNextNode(); //sets StrNode to the next Node
		} while (StrNode!=null); //checks to see if the nextNode is null, stops if it is null, continues if an String object
		

	}//end main

}
