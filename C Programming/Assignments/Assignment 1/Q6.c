#include<stdio.h>
void main()
{
	int male_age,female_age;
	printf("Enter male age:\n");
	scanf("%d",&male_age);
	printf("Enter female age:\n");
	scanf("%d",&female_age);
	if(male_age>=21 && female_age>=18)
	printf("Eligible for marry");
	else
	printf("Not Eligible for marry");

}
