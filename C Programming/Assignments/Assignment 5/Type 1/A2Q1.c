#include<stdio.h>
void discount();
void main()
{discount();
}
void discount()
{
	float price,discount;
	printf("Enter price :\n");
	scanf("%f",&price);
	if(price<=1000)
	{
	  printf("Discount is 5 percent\n");
	  discount =0.05*price;
	}
	else if(1000<price&& price<=5000)
	{
		printf("Discount is 10 percent\n");
		discount =price*0.10;
	}
	else if(5000<price && price<=10000)
	{
		printf("Discount is 15 percent\n");
		discount=0.15*price;
	}
	else 
	{
		printf("Discount is 20 percent\n");
		discount=0.20*price;
	}
	 price =price-discount;
	 printf("Price is %f",price);
}
