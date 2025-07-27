#include<stdio.h>
void  choice();
void main()
{ choice();
}
void choice()
{
	int n,da,ta,hra,basic_salary,total_salary,choice;
	printf("1. for even odd\n");
	printf("2. for total salary\n");
	printf("Enter your choice: ");
	scanf("%d",& choice);
	if(choice==1)
	{
		printf("Enter Number\n");
	    scanf("%d",&n);
	if(n%2==0)
	printf("Number is Even");
	else
	printf("Number is Odd");
    }
    else if(choice==2)
    {
    	printf("Enter your basic salary\n");
    	scanf("%d",&basic_salary);
    	if(basic_salary<=5000)
    	{
		da =basic_salary*0.1;
		ta =basic_salary*0.2;
		hra=basic_salary*0.25;
		total_salary =basic_salary+da+ta+hra;
		printf("The total Salary is %d ",total_salary);
		}
		else
		{
		da =basic_salary*0.15;
		ta =basic_salary*0.25;
		hra=basic_salary*0.3;
		total_salary =basic_salary+da+ta+hra;
		printf("The total Salary is %d ",total_salary);
		}
	}
}
