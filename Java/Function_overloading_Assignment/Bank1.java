package Firstbit.Assignments.Assignment_Function_Overloading;

class Student1{
	int rollno;
	double percentage;
	String name;
	int getRollno() {
		return rollno;
	}
	void setRollno(int rollno) {
		this.rollno = rollno;
	}
	double getPercentage() {
		return percentage;
	}
	void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	
	
}

class Employee1
{
	int id;
	String name;
	double annualsalary;
	int getId() {
		return id;
	}
	void setId(int id) {
		this.id = id;
	}
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	double getAnnualsalary() {
		return annualsalary;
	}
	void setAnnualsalary(double annualsalary) {
		this.annualsalary = annualsalary;
	}
	
	
}



public class  Bank1{

	
		void isApproved(Student1 s)
		{
			if(s.percentage>80)
				System.out.println("Loan Approved is 2 Lakhs");
			else if(s.getPercentage()>60 && s.getPercentage()<=80)
				System.out.println("Loan Approved is 1 Lakh");
			else if(s.getPercentage()>40 && s.getPercentage()<=60)
				System.out.println("Loan Approved is 1 Lakh");
			else if(s.getPercentage() <40)
				System.out.println("No Loan Approved");
		}
		
		
		void isApproved(Employee1 e)
		{
			if(e.getAnnualsalary()>1200000)
				System.out.println("Loan Approved is 7 Lakhs");
			else if(e.getAnnualsalary()>1000000 && e.getAnnualsalary()<=1200000)
				System.out.println("Loan Approved is 6 Lakh");
			else if(e.getAnnualsalary()>600000 && e.getAnnualsalary()<=1000000)
				System.out.println("Loan Approved is 5 Lakh");
			else if(e.getAnnualsalary()>400000 && e.getAnnualsalary()<=600000)
				System.out.println("Loan Approved is 4 Lakh");
			else if(e.getAnnualsalary()<400000)
				System.out.println("No Loan Approved");
		}
		
	}
class check1{
     public static void main(String[] args)
{
    	 Student1 s=new Student1();
    	 s.setRollno(12);
    	 s.setPercentage(74);
    	 s.setName("anupama");
    	 Employee1 e=new Employee1();
    	 e.setId(123);
    	 e.setName("Pranjal");
    	 e.setAnnualsalary(5600000);
    	 Bank1 b1=new Bank1();
 		b1.isApproved(s);
 		b1.isApproved(e);
    	 
}
}
