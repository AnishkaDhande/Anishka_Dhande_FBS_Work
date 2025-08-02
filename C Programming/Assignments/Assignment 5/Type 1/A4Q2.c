#include<stdio.h>
void main()
{
	isPrime();
}
void isPrime()
{

	int n,i,flag,start=1,end;
	printf("Enter end :\n");
	scanf("%d",&end);
	printf("prime numbers from 1 to %d are :",end);
	for(n=start;n<=end;n++)
	{  flag =1;
	for(i=2;i<n;i++)//i<n to reduce iteration we used i<n/2
	{  
	 if(n%i==0)
		flag=0;
	}
	if(flag==1)
	printf("\n%d ",n);

    }
}
