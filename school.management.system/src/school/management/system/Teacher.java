package school.management.system;

public class Teacher {
	
	private int id;
	private String name;
	private int salary;
	private int salaryEarned;
	
	public Teacher(int id, int salary, String name) {
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.salaryEarned=0;
	}
	
	public String getName() {
		return name;
	}
	
	public int getId() {
		return id;
	}
	//get the salary
	
	public int getSalary() {
		return salary;
	}
	
	//Set the salary
	
	public void setSalary(int salary) {
		this.salary=salary;
	}
	
	public void receiveSalary(int salary) {
		salaryEarned+=salary;
		School.updateTotalMonetSpent(salary);
		
	}
}
