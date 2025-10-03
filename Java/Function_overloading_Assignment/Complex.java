package Firstbit.Assignments.Assignment_Function_Overloading;


public class Complex {
   int real,imaginary;

   Complex(int real,int imaginary)
   {
	   this.real=real;
	   this.imaginary=imaginary;
   }
}
class method{
    void add(Complex c1,Complex c2)
   {//to add real part to real part and imaginary to imaginary of two numbers
	   int a=c1.real+c2.real;
	   int b=c1.imaginary+c2.imaginary;
	   System.out.println("real :"+a+" Imaginary :"+b);
   }
    void add(Complex c1)
    {//to add a integer to real part of no and imaginary part of no
    	int real=c1.real+5;
    	int imaginary=c1.imaginary+5;
    	System.out.println(" real :"+real+" Imaginary :"+imaginary);
    }
	
}
class call{
	public static void main(String args[]) {
		Complex c1=new Complex(10,20);
		Complex c2=new Complex(30,40);
		method m1=new method();
		m1.add(c1);
		m1.add(c1,c2);
	
	}
	
}
