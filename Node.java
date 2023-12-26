package LinkedList;

public class Node {
	int data;
	Node next;//self reference 
	Node(int data){
		this.data=data;
		this.next=null;//address of other node.
	}
	
}
/*
 * public class Node { Employee e; Node next;//self refrential node
 * 
 * Node(Employee e){ this.e=e; this.next=null; } }
 */
