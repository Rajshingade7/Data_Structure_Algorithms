package LinkedList;

import java.util.Scanner;

public class Dynamic_queue {
Node rear;
    
    void createList()
    {
        rear=null;//root is never created but assigned as per need
        //the 1st node is called root
    }
    void Enqueue(int e)
    {   Node n=new Node(e);
        if(rear==null)
            rear=n;
        else
        {
           Node t=rear;//1
           while(t.next!=null)//2
               t=t.next;
           t.next=n;//3
        }
        System.out.println("Inserted");       
    }
    void Dequeue()
    {
        if(rear==null)
            System.out.println("Empty List");       
        else
        {
          Node front=rear;//1
          rear=rear.next;//2
          System.out.println(front.data+" deleted");       
        }
    }
    void print_queue()
    {  if(rear==null)
                System.out.println("Empty List");       
       else
       {
           Node front=rear;
           while(front!=null)
           {
               System.out.println(front.data);
               front=front.next;
           }
       }   
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        Dynamic_queue obj=new Dynamic_queue();
        obj.createList();
        int ch;
        do
        {
          System.out.println("\n1.Insert \n2.Delete\n3.Print_queue\n0.Exit\n:");
          ch=in.nextInt();//read
          switch(ch)
          {
              case 1:
                      System.out.println("\nEnter a number:");
                      int e=in.nextInt();
                      obj.Enqueue(e);
                      break;
              case 2:
                      System.out.println("\nThe number is deleted:"+obj.rear.data);
                      obj.Dequeue();
                      break;    
                      
              case 3:
                     obj.print_queue();
                     break;
              
              case 0:
                      System.out.println("Exiting");
                  break;
              default:
                      System.out.println("Wrong Choice");
                  break;
          }
            
        }while(ch!=0);
    }
}
