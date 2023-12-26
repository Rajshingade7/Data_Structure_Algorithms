package LinkedList;

import java.util.Scanner;

public class Stack_using_linkedlist {

Node toss;
    
    void createList()
    {
        toss=null;//root is never created but assigned as per need
        //the 1st node is called root
    }
    void push(int e)
    {
        Node n=new Node(e);
        if(toss==null)
            toss=n;
        else
        {
            n.next=toss;//1
            toss=n;//2
        }
        System.out.println("Inserted");       
    }
    void pop()
    {
        if(toss==null)
            System.out.println("Empty List");       
        else
        {
          Node t=toss;//1
          toss=toss.next;//2
          System.out.println(t.data+" deleted");       
        }
    }
    void peek()
    {
        if(toss==null)
            System.out.println("Empty List");       
        else
        {
          System.out.println(toss.data);       
        }
    }
    void print_stack()
    {  if(toss==null)
                System.out.println("Empty List");       
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
    	 Scanner in=new Scanner(System.in);
         Stack_using_linkedlist obj=new Stack_using_linkedlist();
         obj.createList();
         int ch;
         do
         {
           System.out.println("\n1.Push(insert left)\n2.pop(delete left)\n3.Print Stack\n4. peek\n0.Exit\n:");
           ch=in.nextInt();//read
           switch(ch)
           {
               case 1:
                       System.out.println("\nEnter a number:");
                       int e=in.nextInt();
                       obj.push(e);
                       break;
               case 2:
                       System.out.println("\n deleting the number:");
                       
                       obj.pop();
                       break;
               case 3:
            	   obj.print_stack();
            	   break;
               case 4:
            	   obj.peek();
            	   break;
            	   
               case 0:
            	   System.out.println("Exited");
            	   break;
            	   
               
           }
             
         }while(ch!=0);
    }
}
