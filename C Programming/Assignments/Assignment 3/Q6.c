#include<stdio.h>
void main()
{
	int n,i=1,sum =0;
	printf("Enter Number\n");
	scanf("%d",&n);
	while(n>i)
	{
		if(n%i==0)
		{
			sum=sum+i;
		}
		   i++;
	}
		if(sum==n)
		{
		   printf("Entered number %d is Perfect Number ",n);
		}
		else
		{
		   printf("The Number is not perfect number");
		}
	
	
}
