#include<stdio.h>
void main()
{
	int num,i,end,start=1;
	printf("Enter end :\n");
	scanf("%d",&end);
	printf("perfect numbers from 1 to %d are :",end);
   for(num=start;num<=end;num++)
   {
   	 int sum=0;
	for(i=1;i<num;i++)
	{   
	    if(num%i==0)
	    {
	    	sum=sum+i;
		}
	}
	    if(sum==num)
		printf("%d ",num);
   }
}
