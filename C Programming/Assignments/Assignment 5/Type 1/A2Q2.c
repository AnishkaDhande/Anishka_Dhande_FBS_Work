#include<stdio.h>
void islargest();
void main()
{
	 islargest();
}
 void islargest()
 {
 
	int a,b,c;
	printf("Enter First Number\n");
	scanf("%d",&a);
	printf("Enter Second Number\n");
	scanf("%d",&b);
	printf("Enter Third Number\n");
	scanf("%d",&c);
	if(a>b && a>c)
	{
	printf("The Greater number is %d ",a);
    }    
	else if(b>a && b>c)
	{
	printf("The Greater number is %d ",b);
    }
	else
	{
	printf("The Greater number is %d ",c);
    }
	
}
