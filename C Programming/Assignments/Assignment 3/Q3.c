#include<stdio.h>
void main()
{
	int no ,rem,sum=0;
	printf("Enter Number\n");
	scanf("%d",&no);
	while(no>0)
	{
		rem=no%10;
		sum =sum+rem;
		no=no/10;
		
	}
	printf("Sum of Digits of entered number is %d ",sum);
}
