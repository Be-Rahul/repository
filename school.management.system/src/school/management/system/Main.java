package school.management.system;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher Lizzy = new Teacher(1,10000,"Lizzy");
		Teacher Mia = new Teacher(2,13000,"Mia");
		Teacher John = new Teacher(3,18000,"John");
		
		List<Teacher> teacherList = new ArrayList<>();
		teacherList.add(Lizzy);
		teacherList.add(Mia);
		teacherList.add(John);
		
		Student sheldon = new Student(1,"sheldon",3);
		Student Max = new Student(1,"Max",2);
		Student Rob = new Student(1,"Rob",4);
		
		List<Student> studentList = new ArrayList<>();
		studentList.add(sheldon);
		studentList.add(Rob);
		studentList.add(Max);
		
		School JHRS = new School(teacherList,studentList);
		
				
		Max.payFees(5000);
		sheldon.payFees(8000);
		System.out.println("JHRS has earned $ "+ JHRS.getTotalMoneyEarned());	
		
		System.out.println("----------Pay Salary---------");
		Lizzy.receiveSalary(Lizzy.getSalary());
		
		System.out.println("JHRS has spent for salary to " + Lizzy.getName()+" and now has $ " + JHRS.getTotalMoneyEarned());
	}

}
