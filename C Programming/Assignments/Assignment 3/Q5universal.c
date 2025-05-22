#include<stdio.h>
#include<math.h>
void main()
{
	int n,sum=0,count=0,rem,m=1,i;
	printf("Enter Number\n");//1324
	scanf("%d",&n);
	int temp=n;
	while(temp>0)
	  {  
	      count++;
	      temp=temp/10;
      }
        temp=n;
        while(temp>0)
		{ 
		   rem=temp%10;
		   //m=1;
		   //for(i=1;i<=count;i++)
		   //{
		 	//m=m*rem;
		   //}
		   
		   sum=sum+pow(rem,count);
		   temp=temp/10;
        }
      if(n==sum)
       printf("The number is Armstrong");
      else
      printf("The number is not Armstrong");
}
