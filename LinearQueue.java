package Day_2_Queue;

import java.util.Scanner;

public class LinearQueue {

	int front,rear,Maxsize,queue[];
	void createQueue(int size) {
		Maxsize=size;
		queue=new int[Maxsize];
		front=0;
		rear=-1;
	}
	void enqueue(int e) {
		rear++;
		queue[rear]=e;
	}
	boolean is_full() {
		if(rear==Maxsize-1)
			return true;
		else
			return false;
	}
	int dequeue() {
		int temp=queue[front];
		front++;
		return temp;
		
	}
	boolean is_empty() {
		if(front>rear)
			return true;
		else
			return false;
	}
	void print_queue() {
		for(int i=front;i<=rear;i++) {
			System.out.println(queue[i]);
		}
	}
	public static void main(String args[]) {
		 Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the size of Queue");
	        int size = sc.nextInt();
	        LinearQueue obj = new LinearQueue();
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

