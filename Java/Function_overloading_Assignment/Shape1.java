package Firstbit.Assignments.Assignment_Function_Overloading;
class circle2
{
	float r;

	float getR() {
		return r;
	}

	void setR(float r) {
		this.r = r;
	}
}

class rectangle
{int l,b;

int getL() {
	return l;
}

void setL(int l) {
	this.l = l;
}

int getB() {
	return b;
}

void setB(int b) {
	this.b = b;
}
	
}

class Triangle1
{
	float base,height;

float getBase() {
	return base;
}

void setBase(float base) {
	this.base = base;
}

float getHeight() {
	return height;
}

void setHeight(float height) 
{
	this.height = height;
}
	
}


public class Shape1{
	void area(circle2 c)
	{
		float a=3.14f*c.getR()*c.getR();
		System.out.println("Area of Circle is "+a);
	}
	
	void area(Triangle1 t)
	{
		float a=0.5f*t.getBase()*t.getBase();
		System.out.println("Area of Triangle is "+a);
	}

	
	void area(rectangle r)
	{
		int a=r.getL()*r.getB();
		System.out.println("Area of Rectangle is "+a);
	}
}
class cal
{
	public static void main(String args[]) 
	{    
		circle2 c=new circle2();
		c.setR(12);
		Triangle1 t=new Triangle1();
		t.setBase(12);
		t.setHeight(15);
		rectangle r=new rectangle();
		r.setL(13);
		r.setB(2);
		Shape1 s=new Shape1();
		s.area(t);
		s.area(r);
		s.area(c);
	}
}
