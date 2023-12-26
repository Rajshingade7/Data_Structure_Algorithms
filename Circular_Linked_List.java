package LinkedList;

import java.util.Scanner;

import java.util.Scanner;

public class Circular_Linked_List {
Node root;
	
	void createList() {
		root = null;
	}
	
	void insertLeft(Employee e) {
		Node n = new Node(e);
		if(root == null) 
			root = n;
		else
		{
			n.next = root; 
			root = n; 
		}
		System.out.println("Inserted");
	}
	
	void insertRight(Employee e) {
		Node n = new Node(e);
		if(root == null) 
			root = n;
		else
		{
			Node t=root;
	           while(t.next!=null)
	               t=t.next;
	           t.next=n;
		}
		System.out.println("Inserted");
	}
	void deleteLeft() {
		if(root == null) 
			System.out.println("Empty List");
		else
		{
			Node t = root; 
			System.out.println(t.e + " deleted");
			root = root.next; 
			
		}
	}
	void deleteRight() {
		if(root == null) 
			System.out.println("Empty List");
		else
		{
			Node t = root;
			Node t2 = t;
			while(t.next!=null) {
				t2=t;
				t=t.next;
			}
			if(t==root)
				root=null;
			else
				t2.next=null;
			System.out.println(t.e + " deleted");
		}
	}
	void print_list() {
		if(root==null) {
			System.out.println("Empty List");
		}
		else {
			Node t= root;
			System.out.println();
			while(t!=null) {
				System.out.println(t.e);
				t=t.next;
			}
		}
	}
	void delete_key(int key) {
		if(root==null) {
			System.out.println("Empty List");
		}
		else {
			Node t= root;
			Node t2=root;
			while(t!=null && t.e.getId()!=key) {
				t2=t;
				t=t.next;
			}
			if(t==null)
				System.out.println(key+" not found");
			else {
				System.out.print(key+" found ");
				if(t==root) {
					root=root.next;
				}
				else if(t.next==null) {
					t2.next=null;
				}
				else {
					t2.next=t.next;
				}
				System.out.println("Employee deleted "+ t.e);
			}
		}
	}
	void insertAt(int index, Employee e) {
		if(index==0) {
			Node n = new Node(e);
			if(root == null) 
			root = n;
			else {
				n.next = root; 
				root = n; 
			}
		}
		else {
			Node t= root;
			Node t2=root;
	           while(t!=null && index>0)
	           {
	        	   t2=t;
	               t=t.next;
	               index--;
	           }
			if(t==null)
				System.out.println("Index out of Range");
			else {
				Node n=new Node(e);
                t2.next=n;
                n.next=t;
                System.out.println("iserted:");
			}
		}
	}
	boolean search(int id) {
		if(root==null) {
			System.out.println("Empty List");
			return false;
		}
		else {
			Node t= root;
			while(t!=null && t.e.getId()!=id) {
				t=t.next;
			}
			if(t==null) {
				System.out.println(id+" not found");
				return false;
			}
			else {
				System.out.println("Employee Found with Details: "+ t.e);
				return true;
			}
		}
	}
	void Update(int id, Employee e) {
		
		if(root==null) {
			System.out.println("Empty List");
		}
		else {
			Node t= root;
			while(t!=null && t.e.getId()!=id) {
				t=t.next;
			}
			if(t==null)
				System.out.println(id+" not found");
			else {
				t.e.setName(e.getName());
				t.e.setGender(e.getGender());
				t.e.setSalary(e.getSalary());
				System.out.println("Details Updated as "+t.e);
			}
		}
	}
	public static void main(String[] args) {
		Circular_Linked_List l =new Circular_Linked_List();
		Scanner sc = new Scanner(System.in);
		l.createList();
		int ch;
		do {
			System.out.println("1:Insertleft, 2: InsertRight, 3: DeleteLeft, 4: DeleteRight, 5: PrintById, 6: Printall, 7:delete_Id, 8:InsertAt, 9:Update, 0:Exited");
			ch= sc.nextInt();
			switch(ch) {
			case 1: System.out.println("Enter Employee:");
				{
				System.out.println("Enter name: ");
				String name=sc.next();
				System.out.println("Enter Gender:");
				String Gender = sc.next();
				System.out.println("Enter Salary:");
				double Salary=sc.nextDouble();
				Employee e=new Employee(name,Gender,Salary);
				l.insertLeft(e);
				}
				break;
			case 2: System.out.println("Enter Employee:");
				{
				System.out.println("Enter name: ");
				String name=sc.next();
				System.out.println("Enter Gender:");
				String Gender = sc.next();
				System.out.println("Enter Salary:");
				double Salary=sc.nextDouble();
				Employee e=new Employee(name,Gender,Salary);
				l.insertRight(e);
				}
				break;
			case 3: 
				l.deleteLeft();
				break;
			case 4: 
				l.deleteRight();
				break;
			case 5: System.out.println("Enter Id to search");
				l.search(sc.nextInt());
				break;
			case 6: l.print_list();
				break;
			case 7: 
				System.out.println("Enter data to delete");
				l.delete_key(sc.nextInt());
				break;
			case 8:
                System.out.println("\nEnter index and Employee Details to insert:");
                System.out.println("Enter Index");
                int index=sc.nextInt();
                System.out.println("Enter Employee:");
				{
				System.out.println("Enter name: ");
				String name=sc.next();
				System.out.println("Enter Gender:");
				String Gender = sc.next();
				System.out.println("Enter Salary:");
				double Salary=sc.nextDouble();
				Employee e=new Employee(name,Gender,Salary);
				l.insertAt(index,e);
				}
				break;
			case 9:
				System.out.println("\nEnter Id and datails for Updation:");
                int id=sc.nextInt();
                if(l.search(id)) {
                	System.out.println("Enter Employee: ");
					System.out.println("Enter name: ");
					String name=sc.next();
					System.out.println("Enter Gender: ");
					String Gender = sc.next();
					System.out.println("Enter Salary: ");
					double Salary=sc.nextDouble();
					Employee e=new Employee(name,Gender,Salary);
					l.Update(id, e);
					}
				break;
			case 0: System.out.println("exited");
				break;
			default : System.out.println("Enter Valid Choice");
				break;
			}
		}while(ch!=0);
	sc.close();
	}

}
