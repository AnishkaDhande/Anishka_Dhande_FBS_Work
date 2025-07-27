#include<stdio.h>
void main()
{  salary();
}
 void salary()
{
	int basic_salary;
	float da,ta,hra,total_salary=0;
	printf(" Enter basic salary : ");
	scanf("%d",&basic_salary);
	if(basic_salary<=5000)
	{
		da =basic_salary*0.10;
		ta =basic_salary*0.20;
		hra =basic_salary*0.25;
		total_salary =da+ta+hra+basic_salary;
	    printf("Total salary is %f ",total_salary);
	}
	else 
	{
		da =basic_salary*0.15;
		ta=basic_salary*0.25;
		hra =basic_salary*0.30;
		total_salary =da+ta+hra+basic_salary;
	    printf("Total salary is %f ",total_salary);
	}
}
