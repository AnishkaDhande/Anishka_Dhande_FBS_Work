#include<stdio.h>
#include<math.h>
void main()
{
	int start=1,n,end,rem,count ,sum;
	printf("Enter end :\n");
	scanf("%d",&end);
	printf("Armstrong numbers from 1 to %d are :",end);
	for(n=start;n<=end;n++)
	{   
	    int temp=n;
		count=0;
		sum=0;
		while(temp>0)
		{
			temp=temp/10;
			count++;
		}
		temp=n;
		while(temp>0)
		{
			rem=temp%10;
			sum=sum+pow(rem,count);
			temp=temp/10;
		}
		if(sum==n)
		printf("%d ",n);
	}
}
