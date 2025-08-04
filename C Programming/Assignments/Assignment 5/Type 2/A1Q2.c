#include<stdio.h>
 float area();
  float circum();
  	float rectPeri();
  	float rectArea();
  
     float r;
	float l,b;
void main()
{
	printf("Enter radius\n");
    scanf("%f",&r);
	float A= area();
	float P= circum();
	float rectPeri();
  	float rectArea();
	  
	printf("Area of circle is %f ",A);
    printf("\nCircumference of circle is %f ",P);
    printf("\nTo print Area and perimeter of rectangle\n");
    printf("Enter Length of rectangle : ");
	scanf("\n%f",&l);
	printf("Enter breadth of rectangle : ");
	scanf("%f",&b);
	 float X=rectArea();
	 float Y=rectPeri();
	printf("area of rectangle is %f ",X);
	printf("\nPerimeter of rectangle is %f ",Y);
}
 float area()
{
float a;
a=3.14*r*r;
return a;
}
 float circum()
{
float p;
p=2*3.14*r;
return p;
}
float rectArea()
{
	float a;
	a=l*b;
	return a;
}
float rectPeri()
{
	float p;
	p = 2*(l+b);
	return p;
}
