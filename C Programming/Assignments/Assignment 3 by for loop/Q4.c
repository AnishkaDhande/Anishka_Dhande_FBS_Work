#include<stdio.h>
void main()
{
	int i,flag=0,n;
	printf("Enter Number\n");
	scanf("%d",&n);
	for(i=2;i<n;i++)
	{
		if(n%i==0)
		{
			flag=1;
			break;
		}
	}
	if(flag ==0)
	{
		printf("Number is Prime");
	}
	else
	    printf("Number is not prime");
}
