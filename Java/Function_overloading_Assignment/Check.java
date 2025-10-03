package Firstbit.Assignments.Assignment_Function_Overloading;
import java.util.Scanner;
class Student{
	int rollno;
	double percentage;
	String name;
	Student(int rollno,double percentage ,String name )
	{
		this.rollno=rollno;
		this.percentage=percentage;
		this.name=name;
	}
	
}

class Employee
{
	int id;
	String name;
	double annualsalary;
	Employee(int id,String name,double annualsalary)
	{
		this.id=id;
		this.name=name;
		this.annualsalary=annualsalary;
		
	}
	
}



public class bank1{

	
		void isApproved(Student s)
		{
			if(s.percentage>80)
				System.out.println("Loan Approved is 2 Lakhs");
			else if(s.percentage>60 && s.percentage<=80)
				System.out.println("Loan Approved is 1 Lakh");
			else if(s.percentage>40 && s.percentage<=60)
				System.out.println("Loan Approved is 1 Lakh");
			else if(s.percentage <40)
				System.out.println("No Loan Approved");
		}
		
		
		void isApproved(Employee e)
		{
			if(e.annualsalary>1200000)
				System.out.println("Loan Approved is 7 Lakhs");
			else if(e.annualsalary>1000000 && e.annualsalary<=1200000)
				System.out.println("Loan Approved is 6 Lakh");
			else if(e.annualsalary>600000 && e.annualsalary<=1000000)
				System.out.println("Loan Approved is 5 Lakh");
			else if(e.annualsalary>400000 && e.annualsalary<=600000)
				System.out.println("Loan Approved is 4 Lakh");
			else if(e.annualsalary<400000)
				System.out.println("No Loan Approved");
		}
		
	}
 class Bank{
     public static void main(String[] args)
{
    	 Student s=new Student(18,85,"Tanushri");
    	 Employee e=new Employee(123,"Krutika",500000);
    Bank1 b1=new Bank1();
 		b1.isApproved(s);
 		b1.isApproved(e);
    	 
}
}
