#include<stdio.h>
void main()
{
	sum();
}
void sum()
{

   int n,sum,rem=0,firstdigit,lastdigit;
   printf("Enter Number\n");//123
   scanf("%d",&n);
   int temp =n;
   	 rem=n%10;
   	 lastdigit=rem;
   	while(n>0)
   	{
   	 rem=n%10;
   	 firstdigit =rem;
   	 n=n/10;
	   }
   	  sum = lastdigit + firstdigit;
   
printf("Sum of First and Last digit if given number %d is %d ",temp,sum);
}
