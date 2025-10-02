package Firstbit.Assignments.Class_Task;

class Date
{
	int day,month,year;
	void display()
	{
		System.out.printf("Date is %d/%d/%d\n",this.day,this.month,this.year);
	}//this key in above word is option by my opinion but sir thought it provide better performance
	
}

class Time 
{
	int hour,min,sec;
	void display()
	{
		System.out.printf("Time is %d:%d:%d\n",hour,min,sec);
	}//by my opinion code run no problem
}

class Distance
{
	int feet,inch;
	void display()
	{
		System.out.println("Distance in Feet is "+this.feet);
		System.out.println("Distance in inch is "+this.inch);
	}//this key in above word is option by my opinion but sir thought it provide better performance
	
}

class Complex
{   double real, imaginary;
	void display()
	{
		System.out.println("Real number is "+real);
		System.out.println("Complex number is "+imaginary);
	}
	
}

class Rectangle
{
	int length,breadth;
	void display()
	{
		System.out.println("Length of Rectangle is "+this.length);
		System.out.println("Breadth of Rectangle is "+this.breadth);
	}
	
}

class Employee
{
	int empID,age;
	float yearOfExperiance;
	void display()
	{
		System.out.println("Employee ID is "+this.empID);
		System.out.println("Year of Experiance is "+this.yearOfExperiance);
		System.out.println("Age is "+this.age);
	}
	
}


public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//object of Date class
		Date d1 =new Date();
		d1.day=6;
		d1.month=9;
        d1.year=2009;
		d1.display();
		Date d2 =new Date();
		d2.day=21;
		d2.month=07;
        d2.year=1983;
		d2.display();
		
		//object of Time class
		Time t1 =new Time();
		t1.hour=3;
		t1.min=23;
		t1.sec=46;
		Time t2 =new Time();
		t2.hour=6;
		t2.min=26;
		t2.sec=23;
		t1.display();
		t2.display();
		
		Distance D1 =new Distance();
		D1.feet=6;
		D1.inch=9;
		D1.display();

		
		Complex c1=new Complex();
		c1.real=4.5;
		c1.imaginary=4.34;
		c1.display();
		
		Rectangle r1=new Rectangle();
		r1.length=10;
		r1.breadth=5;
		r1.display();
		
		Employee e1= new Employee();
		e1.age=32;
		e1.yearOfExperiance=3.5f;
		e1.empID=22490;
		e1.display();
		


	}

}
