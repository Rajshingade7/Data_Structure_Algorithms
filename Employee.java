package LinkedList;

public class Employee {
	private int id;
	private String name;
	private String Gender;
	private double Salary;
	static int count;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public double getSalary() {
		return Salary;
	}
	public void setSalary(double salary) {
		Salary = salary;
	}
	public int getId() {
		return id;
	}
	public Employee(String name, String Gender, double salary) {
		count++;
		this.id=count;
		this.name=name;
		this.Gender=Gender;
		this.Salary=salary;
		
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", Gender=" + Gender + ", Salary=" + Salary  +"]";
	}
}