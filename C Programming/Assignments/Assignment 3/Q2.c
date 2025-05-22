#include<stdio.h>
void main()
{
	int a,i=1,h;
	printf("Enter Number for Table : ");
	scanf("%d",&a);
	printf("Table of %d is :\n",a);
	while(i<=10)
	{
		h=a*i;
		printf("%d * %d = %d\n",a,i,h);
		i++;
	}
}
