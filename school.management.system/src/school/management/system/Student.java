package school.management.system;

public class Student {
	private int id;
	private String name;
	private int grade;
	private int feesPaid;
	private int feesTotal;
	
	/**
	 * To Create a new student by initializing.
	 * Fees for every student is Rs.30000
	 * Fees paid initially is 0
	 * @param id unique id for student.
	 * @param name name of the student.
	 * @param grade Grade of student.
	 */
	
	public Student(int id, String name, int grade) {
		feesPaid=0;
		feesTotal=30000;
		this.id=id;
		this.name=name;
		this.grade=grade;
		
	}
	
	/**
	 * Used to update student grade
	 * @param grade
	 */

	public void setGrade(int grade)	{
		this.grade=grade;
	}
	
	public void payFees(int fees) {
		
		feesPaid+=fees;	
		School.updateTotalMoneyEarned(feesPaid);
	}
	
	//return fees paid by student
	public int getFeesPaid() {
		return feesPaid;
	}
	
	//Grade of student Grade 1,2,3
	public int getGrade() {
		return grade;
	}
	
	//Return ID of student
	public int getId() {
		return id;
	}
	
	//Return name of student
	public String getName() {
		return name;
	}
	
	//return total fees of student
	public int getFeesTotal() {
		return feesTotal;
	}
	
	public int getRemainingFees() {
		return feesTotal-feesPaid;
	}
	
}
