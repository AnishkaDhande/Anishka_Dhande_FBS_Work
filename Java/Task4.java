package Firstbit.Assignments.Class_Task;

class Date2
{
	int day,month,year;
	Date2(){//sir called this defalut construncto(I learned non parameterize)
		this.day=3;
		this.month=6;
		this.year=1978;
	}
	void display() {
		System.out.println("Day: "+day);
		System.out.println("Month: "+month);
		System.out.println("year: "+year);
	}
}
class Employee2
{
	int id ,salary;
	String name;
	Employee2(){
		this.id=23;
		this.salary=340987;
		this.name="Annirudha";
	}
	Employee2(int id,int salary,String name)
	{
		this.id=id;
		this.salary=salary;
		this.name=name;
	}
	void display() {
		System.out.println("Name: "+name);
		System.out.println("Id: "+id);
		System.out.println("salary: "+salary);
	}
}
class Time2{
	int hour,min,sec;
	Time2(){
		this.hour=6;
		this.min=23;
		this.sec=34;
	}
	Time2(int hour,int min,int sec)
	{
		this.hour =hour;
		this.min=min;
		this.sec=sec;
		
	}
	void display() {
		System.out.println("Hour: "+hour);
		System.out.println("Min: "+min);
		System.out.println("second: "+sec);
	}
}

class HR{
	int id;String name;
	double salary,allowance;
	HR(int id,String name,double salary,double allowance)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.allowance=allowance;
	}
	 void display()
	 {
		 System.out.println("id is "+id);
		 System.out.println("Name is "+name);
		 System.out.println("Salary is "+salary);
		 System.out.println("Allowance is "+allowance);
		 
	 }
}
public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date2 d1=new Date2();
		d1.display();

		Employee2 e/*(e is called reference)*/=new Employee2() ;//non parameterrize constructor(default constructor).display();
        e.display();
		Employee2 e1=new Employee2(32,35000,"Anishka");
		e1.display();
		
		//contructor declaration call 
		Time2 t1=new Time2();//non parameterrize constructor(default constructor)
		t1.display();
		Time2 t2=new Time2(3,45,56);//parameterize constructor of time class
		t2.display();
		
	
	    HR h1=new HR(123,"Ritik",35000,345);
	    h1.display();
}
}