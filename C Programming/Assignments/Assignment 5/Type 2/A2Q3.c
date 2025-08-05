#include<stdio.h>
int operation();
int a,b,c;
char op;
int main()
{

	printf("Enter first Number\n");
	scanf("%d",&a);
	printf("Enter Second Number\n");
	scanf("%d",&b);
	printf("Enter your choices operator (+,-,%,/,*) :\n");
	scanf(" %c",&op);
	int l=operation();
	printf("The result of %d %c %d is %d ",a,op,b,l);
}
int operation()
{
	if(op=='+')
	{
		c=a+b;
		return c;
	}
	else if(op=='-')
	{
		c=a-b;
		return c;
	}
	else if(op=='*')
    {
    	c=a*b;
    return c;
	}
	else if (op=='/')
	{
		c=a/b;
		return c;
	}	
	else if(op=='%')
	{
		c=a%b;
		return c;
	}
	else
	{
	    return c;	
	}
	return 0;
}
