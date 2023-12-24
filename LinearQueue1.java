package Day_2_Queue;

import java.util.Scanner;

public class LinearQueue1 {
	int rear,front,Maxsize,queue[];
	void CreateQueue(int size) {
		queue=new int[size];
		rear=-1;
		front=0;
		Maxsize=size;
	}
	void Enqueue(int a) {
		rear++;
		queue[rear]=a;
		
	}
	int Dequeue() {
		int temp=queue[front];
		front++;
		//rear--; here by this way we can overcome the dr
		return temp;
	}
	boolean is_empty() {
		if(rear<front) {
			return true;
			
		}
		else
			return false;
	}
	boolean is_full() {
		if(rear==Maxsize-1) {
			return true;
		}
		else
			return false;
	}
	void printQueue() {
		for(int i=front;i<=rear;i++) {
			System.out.println(queue[i]);
		}
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter teh size of queue");
		int size=sc.nextInt();
		LinearQueue1 obj=new LinearQueue1();
		obj.CreateQueue(size);
		int ch;
		do {
            System.out.println("\n1. Enqueu\n2. Dequeue\n3. Print\n0. Exit");

			ch=sc.nextInt();
			switch(ch) {
				case 1:
					if(!obj.is_full()) {
						System.out.println("Enter the value to add");
						int a=sc.nextInt();
						obj.Enqueue(a);	
					}
					else
						System.out.println("queue is full");
					break;
				case 2:
					if(!obj.is_empty()) {
						obj.Dequeue();
					}
					else
						System.out.println("Queue is empty");
					break;
				case 3:
					obj.printQueue();
					
					break;
				case 0:
					System.out.println("Exited");
					break;
				default:
					System.out.println("Enter the valid number");
							
			}
		}while(ch!=0);
		
	}
}
