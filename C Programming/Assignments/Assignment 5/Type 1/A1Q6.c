#include<stdio.h>
void temp();
void main()
{temp();
}
 void temp()
{
	float c,f;
	printf("Enter Temperature in celcius\n ");//q1 and Q6 are interchaneged in this type in ass1
	scanf("%f",&c);
	f = (c*1.8)+32;
	printf("The Tempreture in Farhnite is %f ",f);
}
