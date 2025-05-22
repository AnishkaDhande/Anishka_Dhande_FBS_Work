#include<stdio.h>
void main()
{
	int n,i=1,fact=1;
	printf("Enter Number\n");//5 =120
	scanf("%d",&n);
	int temp =n;
	while(n>=i)
	{  
	  fact=	fact*i;
	   i++;
	}
	
	printf("Factorial of given number %d is %d ",temp,fact);
}
