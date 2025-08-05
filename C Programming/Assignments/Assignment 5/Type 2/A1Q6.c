#include<stdio.h>
float temp();
void main()
{
	float n=temp();
	printf("The Tempreture in Farhnite is %f ",n);
}
     float temp()
    {
	float c,f;
	printf("Enter Temperature in celcius\n ");
	scanf("%f",&c);
	f = (c*1.8)+32;
	return f;
}
