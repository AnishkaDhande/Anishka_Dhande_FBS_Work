#include<stdio.h>
void main()
{
	 isStrong();
}
void isStrong()
{

	int n,rem,fact,i,sum=0;
	printf("Enter Number\n");
	scanf("%d",&n);//123
	int temp=n;

	while(n>0)
	{
	  rem=n%10;
	  fact =1;
	  i=1;
	  while(rem >= i)
	  {
	    fact=fact*i;
	    i++;
      }
      sum =sum+ fact;
      n=n/10;
    }
    if(sum == temp)
    {
	printf("The number is Strong number\n");
	}
	else
	printf("The number is not strong number\n");
}
