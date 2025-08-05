#include<stdio.h>
int a,b,c;
int largest();
void main()
{
	
	printf("Enter First Number\n");
	scanf("%d",&a);
	printf("Enter Second Number\n");
	scanf("%d",&b);
	printf("Enter Third Number\n");
	scanf("%d",&c);
	int l=largest();
	printf("The Greater number is %d ",l);
}
	
	int largest()
	{
	if(a>b && a>c)
	{
	return a;
    }    
	else if(b>a && b>c)
	{
	return b;
    }
	else
	{
	return c;
    }
	
}
