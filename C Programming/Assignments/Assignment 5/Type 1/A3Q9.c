#include<stdio.h>
void main()
{
	 isPalindrom();
	 }
void isPalindrom()
{

	int n,rem,rev=0;
	printf("Enter Number\n");//123
	scanf("%d",&n);
	int temp=n;
	while(n>0)
	{
		rem=n%10;
		rev=rev*10+rem;
		n=n/10;
	}
	if(temp==rev)
	{
	printf("The Given Number is Palindrom");
    }
	else 
	{
	printf("The number is Not Palindrom");
    }
}
