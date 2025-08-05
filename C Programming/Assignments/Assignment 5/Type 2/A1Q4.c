#include<stdio.h>
int n;
int isEvenOrOdd();
void main()

{
	printf("Enter Number\n");
	scanf("%d",&n);
	int p=isEvenOrOdd();
	if(p==1)
	printf("The Number is Even");
	else
    printf("The Number is Odd");
}
int isEvenOrOdd()
{
	
	if(n%2==0)
	return 1;
	else
	return 0;
}
