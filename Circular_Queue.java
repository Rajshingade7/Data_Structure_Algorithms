package Day_2_Queue;

import java.util.Scanner;

public class Circular_Queue {
	int front,rear,Maxsize,queue[],cnt;
	void createQueue(int size) {
		Maxsize=size;
		queue=new int[Maxsize];
		front=0;
		rear=-1;
		cnt=0;
	}
	void enqueue(int e) {
		rear=(rear+1)%Maxsize;
		queue[rear]=e;
		cnt++;
	}
	boolean is_full() {
		if(cnt==Maxsize) {
			return true;
		}
		else
			return false;
	}
	int dequeue() {
		int temp=queue[front];
		front=(front+1)%Maxsize;
		cnt--;
		return temp;
		
		
	}
	boolean is_empty() {
		if(cnt==0)
			return true;
		else
			return false;
	}
	void print_queue() {
		int i=front;
		int c=0;
		while(c<cnt) {
			System.out.print(queue[i]+"--");
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
