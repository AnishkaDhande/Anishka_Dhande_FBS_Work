#include<stdio.h>
void main()
{
	float l,b,a,p;
	printf("Enter Length of rectangle : ");
	scanf("\n%f",&l);
	printf("Enter breadth of rectangle : ");
	scanf("%f",&b);
	a=l*b;
	p = 2*(l+b);
	printf("area of rectangle is %f ",a);
	printf("\nPerimeter of rectangle is %f ",p);
}
