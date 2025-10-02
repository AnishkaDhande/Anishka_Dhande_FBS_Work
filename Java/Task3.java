package Firstbit.Assignments.Class_Task;
class Student{
	int rollno,marks;
	String name;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	void display()
	{
		System.out.println("Name of student is "+this.getName());
		System.out.println("Roll No is "+this.getRollno());
		System.out.println("Marks is "+this.getMarks());
		
	}
}
class Employee1{
	int id,salary;
	String name;
	int getId() {
		return id;
	}
	void setId(int id) {
		this.id = id;
	}
	int getSalary() {
		return salary;
	}
	void setSalary(int salary) {
		this.salary = salary;
	}
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	void display()
	{
		System.out.println("Employee ID is "+this.getId());
		System.out.println("Employee Name is "+this.getName());
		System.out.println("Employee salary is "+this.getSalary());
		
	}
}
	class Admin{
		int id,salary,allowance;
		String name;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public int getSalary() {
			return salary;
		}
		public void setSalary(int salary) {
			this.salary = salary;
		}
		public int getAllowance() {
			return allowance;
		}
		public void setAllowance(int allowance) {
			this.allowance = allowance;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		void display()
		{
			System.out.println("Admin Id is "+this.getId());
			System.out.println("Admin salary is "+this.getSalary());
			System.out.println("Admin name is "+this.getName());
			System.out.println("Admin Allowance is "+this.getAllowance());
			
		}
		
	}
	
	

class Time1{
	int hour,min ,sec;

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public int getSec() {
		return sec;
	}

	public void setSec(int sec) {
		this.sec = sec;
	}
	void display()
	{ System.out.print("The Time is : ");
		System.out.print(+this.getHour()+":");
		System.out.print(+this.getMin()+":");
		System.out.println(+this.getSec());
	}
	
}

public class Task3 {
public static void main(String args[])
{
Time1 t=new Time1();
t.setHour(4);
t.setMin(34);
t.setSec(46);
t.display();


Student s=new Student();
s.setRollno(14);
s.setName("Anuradha");
s.setMarks(82);
s.display();

Employee1 e=new Employee1();
e.setId(123);
e.setName("Warsha");
e.setSalary(23454);
e.display();

Admin a=new Admin();
a.setId(1236);
a.setName("Ritik");
a.setSalary(56000);
a.setAllowance(3427);
a.display();

}
}
