package PracticalExample;

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
	
	int dequeue() {
		int temp=queue[front];
		front++;
		return temp;
		
	}
	
	void print_queue() {
		for(int i=front;i<=rear;i++) {
			System.out.println(queue[i]);
		}
	}
	public static void main(String args[]) {
		 LinearQueue obj=new LinearQueue();
		 obj.createQueue(4);
		 obj.enqueue(10);
		 obj.enqueue(20);
		 obj.enqueue(30);
		 obj.enqueue(40);
		 System.out.println("Printing all the queue");
		 obj.print_queue();
		 System.out.println("After Dequeing ");
		 obj.dequeue();
		 obj.print_queue();
	}
}

