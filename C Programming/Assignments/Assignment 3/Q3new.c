#include<stdio.h>
void main()
{
	int n, i=1 ,sum=0;
	printf("Enter Range\n");
	scanf("%d",&n);
	while(n>=i)
	{
		sum=sum+i;
		i++;
	}
	printf("sum of numbers from 1 to %d is %d",n,sum);
}
