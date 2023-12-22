import java.util.*;
public class Stack_balance {
	char stack[], tos, MaxSize;

    void createStack(int size) {
        stack = new char[size];
        // condition for an empty stack it is used

    }

    void push(char e) {
        tos++;
        stack[tos] = e;
    }

    boolean is_full() {
        return tos == MaxSize - 1;
    }

    boolean is_empty() {
        return tos == -1;
    }

    char pop() {
        char a = stack[tos];
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
    public static void main(String args[]) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter sequence to test:");
    	String line=sc.nextLine();
    	System.out.println("next line is "+line);
    	Stack_balance sb=new Stack_balance();
    	sb.createStack(line.length());//Here length of the string is size of the stack
    	for(int i=0;i<line.length();i++) {
    		if(line.charAt(i)=='{') {//Hrer single quote for string and "" for string 
    			sb.push(line.charAt(i));
    		}
    			
    		
    		else if(line.charAt(i)=='}') {
    			if(sb.is_empty()) {
    				char temp[];
    			}
    			
    		}
    	}
    	
    
}
}