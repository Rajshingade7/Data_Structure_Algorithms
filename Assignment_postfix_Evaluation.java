

import java.util.Arrays;
import java.util.Scanner;

public class Assignment_postfix_Evaluation {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s= sc.next();
		System.out.println("Enter the expression");
		String value="";
		Assignment_postfix_Evaluation pf = new Assignment_postfix_Evaluation();
		pf.createStack(s.length());
		String []a= new String[s.length()];
		for (int i = 0; i < a.length; i++) {
			a[i]=s.charAt(i)+"";
		}
		System.out.println(Arrays.toString(a));
		int i =0;
		while(i<a.length) {
			
			if(a[i].equals("+")||a[i].equals("-")||a[i].equals("/")||a[i].equals("*")) {
				String one="";
				String two="";
				if(!pf.isEmpty())
					one= pf.pop();
				if(!pf.isEmpty())
				 two = pf.pop();
				value=pf.evaluate(one, two, a[i]);
				if(!pf.isFull())
				pf.push(value);
				
			}else {
				if(!pf.isFull())
				pf.push(a[i]);
			}
			i++;
		}
		System.out.println(value);
	}
	String evaluate(String b,String a,String o) {
		String r;
		if(o.equals("+")) {
			int res=Integer.parseInt(a)+Integer.parseInt(b);
			
			r=res+"";
		}else if(o.equals("-")) {
			
			int res=Integer.parseInt(a)-Integer.parseInt(b);
			r=res+"";
		}else if(o.equals("*")) {
		
			int res=Integer.parseInt(a)*Integer.parseInt(b);
			r=res+"";
		}else {
	

			int res=Integer.parseInt(a)/Integer.parseInt(b);
			r=res+"";
		}
		return r;
			
	}
	String stack[];int tos,maxSize;
	void createStack(int size) {
		stack= new String[size];
		maxSize=size;
		tos=-1;
	}
	
	void push(String element) {
		
		stack[++tos]=element;
	}
	boolean isFull() {
		if(tos==(maxSize-1))
			return true;
		else
			return false;
	}
	boolean isEmpty() {
		if(tos==-1)
			return true;
		else
			return false;
	}
	String pop() {
		
		String e=stack[tos--];
		   return e;
		
	}
	String peek() {
		return stack[tos];
	}
	void print() {
		for (int i = tos; i >-1; i--) {
			System.out.println(stack[i]);
			
		}
	}
}