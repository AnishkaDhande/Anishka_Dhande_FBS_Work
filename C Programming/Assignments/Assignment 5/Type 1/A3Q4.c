#include<stdio.h>
void main()
{
	isPrime();
}
void isPrime()
{
	int no ,i=2,flag =0;
	printf("Enter Number\n");
	scanf("%d",&no);
	while(i<=no-1)
	{
		if(no%i==0)
		{
		  flag =1;
		  break;
	    }
		i++;
	}
	if(flag==0)
	printf("The number is prime");
	else 
	printf("Number is not prime ");
	
}
