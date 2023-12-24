package Day_2_Queue;

import java.util.Scanner;

public class Circular_Queue2 {
	int front,rear,count,Maxsize,queue[];
	void createQueue(int size) {
		queue=new int[size];
		front=0;
		rear=-1;
		count=0;
		Maxsize=size;
	}
	void enqueu(int a) {
		rear=(rear+1)%Maxsize;
		queue[rear]=a;
		count++;
	}
	void dequeue() {
		int temp=queue[front];
		front=(front+1)%Maxsize;
		System.out.println(temp);
		count--;	
	}
	boolean is_full() {
		if(count==Maxsize) {
			return true;
		}
		else
			return false;
	}
	boolean is_empty() {
		if(count==0)
			return true;
		else 
			return false;
	}
	void print() {
		int i=front;
		int c=0;
		while(c<count) {
			System.out.println(queue[i]);
			i=(i+1)%Maxsize;
			c++;
		}
	}
	public static void main(String args[]) {
		 Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the size of Queue");
	        int size = sc.nextInt();
	        Circular_Queue obj = new Circular_Queue();
	        obj.createQueue(size);
	        int ch;
	        do {
	            System.out.println("\n1. Enqueue\n2. Dequeue\n3. Print\n0. Exit");
	            ch = sc.nextInt();
	            switch (ch) {
	                case 1:
	                    if (!obj.is_full()) {
	                        System.out.println("Enter the number");
	                        int no = sc.nextInt();
	                        obj.enqueue(no);
	                        System.out.println("Enqueed:  " + no);
	                    } else {
	                        System.out.println("Queue is full");
	                    }
	                    break;

	                case 2:
	                    if (!obj.is_empty()) {
	                        System.out.println("Dequeed: " + obj.dequeue());
	                    } else
	                        System.err.println("Queue is empty");
	                    break;


	                case 3:
	                    obj.print_queue();
	                    break;

	                case 0:
	                    System.out.println("Exiting");
	                    break;

	                default:
	                    System.out.println("Invalid value entered");
	                    break;
	            }

	        } while (ch != 0);
	}

}
