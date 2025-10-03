package Firstbit.Assignments.Assignment_Function_Overloading;
import java.util.Scanner;
class Triangle
{
	void area(int b,int h)
	{
		float a=0.5f*b*h;
		System.out.println("Area of Triangle is "+a);
	}
	
	void area(float b1,float h1)
	{
		float a=0.5f*b1*h1;
		System.out.println("Area of Triangle is "+a);
	}
	
	void area(int b,float h1)
	{
		float a=0.5f*b*h1;
		System.out.println("Area of Triangle is "+a);
	}
	
	void area(float b1,int h)
	{
		float a=0.5f*b1*h;
		System.out.println("Area of Triangle is "+a);
	}
	
}

class Rectangle{
	void area(int b,int h)
	{
		int a=h*b;
		System.out.println("Area of Rectangle is "+a);
	}
	
	void area(float b1,float h1)
	{
		float a=b1*h1;
		System.out.println("Area of Rectangle is "+a);
	}
	
	void area(int b,float h1)
	{
		float a=b*h1;
		System.out.println("Area of Rectangle is "+a);
	}
	
	void area(float b1,int h)
	{
		float a=b1*h;
		System.out.println("Area of Rectangle is "+a);
	}
}


class Circle{
	void area(int r) 
	{
		float a=3.14f*r*r;
		System.out.println("Area of Circle is "+a);
	}
	
	void area(float r) 
	{
		float a=3.14f*r*r;
		System.out.println("Area of Circle is "+a);
	}
	
}

public class Shape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter 2 Ineteger Value");
		int b=sc.nextInt();
		int h=sc.nextInt();
		
		System.out.println("Enter 2 Float Value");
		float b1=sc.nextFloat();
		float h1=sc.nextFloat();
		
		Triangle t=new Triangle();
		t.area(b, h);
		t.area(b1, h1);
		t.area(b, h1);
		t.area(b1,h);
		
		
         Rectangle r=new Rectangle();
		r.area(b, h);
		r.area(b1, h1);
		r.area(b, h1);
		r.area(b1,h);
		
		
	System.out.println("Enter 1 integer value for Circle radius");
	    int r1 =sc.nextInt();
	  Circle c=new Circle();
	  c.area(r1);
	  
	  System.out.println("Enter 1 Float value for Circle radius");
	    float r2 =sc.nextFloat();
	  Circle c1 =new Circle();
	  c1.area(r2);

	}

}
