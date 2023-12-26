package LinkedList;

public class DNode {
int data;
DNode left,right;//Self referance
DNode(int data){
	this.data=data;
	this.left=null;
	this.right=null;//Address of other node
}
}
