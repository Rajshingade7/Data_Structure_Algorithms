package Day_2_Queue;

import java.util.Scanner;
/*
 * public class Double_Ended_queue {
 * 
 * int queue[],frontleft,frontright,rearleft,rearright,Maxsize,mid; void
 * createQueue(int size) { Maxsize=size; queue=new int[size]; mid=size/2;
 * frontleft=mid; frontright=mid-1; rearleft=mid-1; rearright=mid;
 * 
 * 
 * } void enqueue(int a1,int a2) { rearleft++; queue[rearleft]=a1; rearright--;
 * 
 * queue[rearright]=a2;
 * 
 * 
 * } boolean is_full() { if((rearleft==Maxsize) &&(rearright==0)) return true;
 * else return false; }
 * 
 * void dequeue() { int temp1=queue[frontleft]; frontleft++;
 * 
 * System.out.println(temp1); int temp2=queue[frontright]; frontright--;
 * System.out.println(temp2);
 * 
 * } boolean is_empty() { if((frontleft>rearleft)&&(frontright<rearright))
 * return true; else return false; } void printqueue() { for(int
 * i=frontleft;i<=rearleft;i++) { System.out.println(queue[i]); } for(int
 * i=frontright;i>=rearright;i--) { System.out.println(queue[i]); } } public
 * static void main(String args[]) { Scanner sc = new Scanner(System.in);
 * System.out.println("Enter the size of Queue"); int size = sc.nextInt();
 * Double_Ended_queue obj = new Double_Ended_queue(); obj.createQueue(size); int
 * ch; do { System.out.println("\n1. Enqueue\n2. Dequeue\n3. Print\n0. Exit");
 * ch = sc.nextInt(); switch (ch) { case 1: if (!obj.is_full()) {
 * System.out.println("Enter the two number"); int no1 = sc.nextInt(); int
 * no2=sc.nextInt(); obj.enqueue(no1,no2); System.out.println("Enqueed:  " +
 * no1+" "+no2); } else { System.out.println("Queue is full"); } break;
 * 
 * case 2: if (!obj.is_empty()) { obj.dequeue(); } else
 * System.err.println("Queue is empty"); break;
 * 
 * 
 * case 3: obj.printqueue(); break;
 * 
 * case 0: System.out.println("Exiting"); break;
 * 
 * default: System.out.println("Invalid value entered"); break; }
 * 
 * } while (ch != 0); }
 * 
 * }
 * 
 */
public class Double_Ended_queue 
{
    int queue[],front_left,front_right,rear_left,rear_right,MaxSize,mid;
    void createQueue(int size)
    {
        MaxSize=size;
        queue=new int[size];
        mid=size/2;
        front_left=mid;
        front_right=mid-1;
        rear_left=mid-1;
        rear_right=mid;
                
    }
    void enqueue_left(int e)
    { 
        rear_left++;
        queue[rear_left]=e;
   
        
    }
    void enqueue_right(int e)
    {
        rear_right--;
        queue[rear_right]=e;
       
    }
    boolean is_full_left()
   {
       if(rear_left==MaxSize-1)
           return true;
       else
           return false;
   }
    
    boolean is_full_right()
   {
       if(rear_right==0)
           return true;
       else
           return false;
   }
    
    int dequeue_left()
    {
        int temp=queue[front_left];
        front_left++;
        
        return(temp);
    }
     int dequeue_right()
    {
        int temp=queue[front_right];
        front_right--;
        return(temp);
    }
   boolean is_empty_right()
   {
       if(front_right<rear_right)
           return true;
       else
           return false;
   }
    boolean is_empty_left()
   {
       if(front_left>rear_left)
           return true;
       else
           return false;
   } 
 void print_queue_left()
     {
         for(int i=front_left;i<=rear_left;i++)
             System.out.println(queue[i]);
     }   
 void print_queue_right()
     {
         for(int i=front_right;i>=rear_right;i--)
             System.out.println(queue[i]);
     }
 public static void main(String args[])
     {
         Scanner in=new Scanner(System.in);
         System.out.println("Enter size of stack:");
         int size=in.nextInt();
         Double_Ended_queue obj=new Double_Ended_queue();
         obj.createQueue(size);
         int ch;
         do
         {
           System.out.println("\n1.Enqueue_Left\n2.Enqueue_Right\n3.Dequeue_Left\n4.Dequeue_right\n5.Print_left\n6.Print_right\n0.Exit\n:");
           ch=in.nextInt();//read
           switch(ch)
           {
               case 1:
                   if(!obj.is_full_left())
                   {
                       System.out.println("\nEnter a number:");
                       int no=in.nextInt();
                       obj.enqueue_left(no);
                       System.out.println("Enqueued "+no);
                   }
                   else
                       System.out.println("Queue is Full");
                   break;
                case 2:
                   if(!obj.is_full_right())
                   {
                       System.out.println("\nEnter a number:");
                       int no=in.nextInt();
                       obj.enqueue_right(no);
                       System.out.println("Enqueued "+no);
                   }
                   else
                       System.out.println("Queue is Full");
                   break;
               case 3:
                    if(!obj.is_empty_left())
                   {
                       System.out.println("Dequeued "+obj.dequeue_left());
                   }
                   else
                       System.out.println("Queue is Empty");
                   break;
               case 4:
                     if(!obj.is_empty_right())
                   {
                       System.out.println("Dequeued "+obj.dequeue_right());
                   }
                   else
                       System.out.println("Queue is Empty");
                   break;
               case 5:
                    if(!obj.is_empty_left())
                     {
                       System.out.println("Elements in queue are");
                       obj.print_queue_left();
                     }
                    else
                       System.out.println("Queue is Empty");
                   break;
                case 6:
                    if(!obj.is_empty_right())
                     {
                       System.out.println("Elements in queue are");
                       obj.print_queue_right();
                     }
                    else
                       System.out.println("Queue is Empty");
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