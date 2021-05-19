package school.management.system;

import java.util.List;

public class School {
	
	private List<Teacher> teachers;
	private List<Student> students;
	private static int totalMoneyEarned;
	private static int totalMonetSpent;
	
	public School(List<Teacher> teachers, List<Student> students) {
		this.teachers= teachers;
		this.students= students;
		totalMoneyEarned=0;
		totalMonetSpent=0;
	}
	
	public List<Student> getStudents() {
		return students;
	}
	public List<Teacher> getTeachers() {
		return teachers;
	}
	
	public void addTeacher(Teacher teacher) {
		teachers.add(teacher);
	}

	public void addStudents(Student student) {
		students.add(student);
	}
	
	public int getTotalMoneyEarned() {
		return totalMoneyEarned;
	}
	
	public static void updateTotalMoneyEarned(int MoneyEarned) {
		totalMoneyEarned += MoneyEarned;
	}
	
	public int getTotalMonetSpent() {
		return totalMonetSpent;
	}
	
	public static void updateTotalMonetSpent(int moneySpent) {
		totalMoneyEarned-=moneySpent;
	}
}
