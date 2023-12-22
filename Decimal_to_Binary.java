import java.util.*;
public class Decimal_to_Binary {
	int stack[], tos, MaxSize;

    void createStack(int size) {
        stack = new int[size];
        MaxSize = size;
        tos = -1; // condition for an empty stack it is used

    }

    void push(int e) {
        tos++;
        stack[tos] = e;
    }

    boolean is_full() {
        return tos == MaxSize - 1;
    }

    boolean is_empty() {
        return tos == -1;
    }

    int pop() {
        int a = stack[tos];
        tos--;
        return a;

    }

    int peek() {
        return stack[tos];
    }

    void print_stack() {
        for (int i = tos; i > -1; i--) {
            System.out.println(stack[i]);
        }
    }

	/*
	 * public void adding(int n,Decimal_to_Binary db) { int i=n%2; db.push(i);
	 * n=n/2;
	 * 
	 * }
	 */
    public static void main(String args[]) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the number ");
    	int n=sc.nextInt();
    	Decimal_to_Binary db=new Decimal_to_Binary();
    	db.createStack(n);
    	//db.adding(n, db);
    	db.print_stack();
    	
    	
    	
    }
    
}
