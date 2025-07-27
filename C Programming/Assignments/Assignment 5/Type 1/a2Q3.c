#include<stdio.h>
void operation();
int main()
{
 operation();
}
void operation()
{
	int a,b,c;
	char op;
	printf("Enter first Number\n");
	scanf("%d",&a);
	printf("Enter Second Number\n");
	scanf("%d",&b);
	printf("Enter your choices operator (+,-,%,/,*) :\n");
	scanf(" %c",&op);
	if(op=='+')
	{
		c=a+b;
		printf("sum of numbers is %d",c);
	}
	else if(op=='-')
	{
		c=a-b;
		printf("Substraction is %d ",c);
	}
	else if(op=='*')
    {
    	c=a*b;
    	printf("product of two numbers is %d",c);
	}
	else if (op=='/')
	{
		c=a/b;
		printf("Quotient of numbers is %d",c);
	}	
	else if(op=='%')
	{
		c=a%b;
		printf("Remainder is %d",c);
	}
	else
	{
	    printf("Invalid Input");	
	}
	return 0;
}
