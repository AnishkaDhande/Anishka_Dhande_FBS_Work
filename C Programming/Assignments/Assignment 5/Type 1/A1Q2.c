#include<stdio.h>
void circle();
void main()
{
	circle();
}
   void circle()
{
float r,a,p;
printf("Enter radius\n");
scanf("%f",&r);
a= 3.14f*r*r;
p=2*3.14*r;
printf("Area of circle is %f ",a);
printf("\nCircumference of circle is %f ",p);
}
