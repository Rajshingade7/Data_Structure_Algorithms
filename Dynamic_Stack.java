package PracticalExample;

import java.util.Scanner;

class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
		next=null;
	}
}
public class Dynamic_Stack {
	
Node toss;
    
    void CreateStack()
    {
        toss=null;
    }
    void push(int e)
    {
        Node n=new Node(e);
        if(toss==null)
            toss=n;
        else
        {
            n.next=toss;
            toss=n;
        }
    }
    void pop()
    {
        if(toss==null)
            System.out.println("Empty stack");       
        else
        {
          Node t=toss;
          toss=toss.next;
          System.out.println("This data is deleted : "+t.data);       
        }
    }
    void print_stack()
    {  if(toss==null)
                System.out.println("Empty stack");       
       else
       {
           Node t=toss;
           while(t!=null)
           {
               System.out.println(t.data);
               t=t.next;
           }
       }   
    }
    public static void main(String args[]) {
         Dynamic_Stack obj=new Dynamic_Stack();
         obj.CreateStack();
         obj.push(10);
         obj.push(20);
         obj.push(30);
         obj.push(40);
         obj.print_stack();
         obj.pop();
         System.out.println("After deleting new stack :");
         obj.print_stack();
         obj.push(50);
         System.out.println("After adding one element");
         obj.print_stack();
    }
}