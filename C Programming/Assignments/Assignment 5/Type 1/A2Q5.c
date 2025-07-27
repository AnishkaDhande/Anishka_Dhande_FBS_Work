#include<stdio.h>
void purchase();
void main()
{
 purchase();
}
void purchase()
{
	char ch;
	int discount,purchase_price;
    printf("Enter purchase Price\n ");
	scanf("%d",&purchase_price);
	fflush(stdin);
	printf("customer is Student : y or N\n");
	scanf("%c",&ch);

	if(ch=='Y'||ch=='y')
	{
	if(purchase_price>500)
		{
			discount =purchase_price*0.20;
			purchase_price =purchase_price - discount;
			printf("The purchase price is %d ",purchase_price);
		}
    else
		{
			discount =0.10*purchase_price;
			purchase_price =purchase_price - discount;
			printf("The purchase_price is %d ",purchase_price);
		}
	}
	else if(ch== 'n' ||ch =='N')
	{
	if(purchase_price>600)
	{
	 discount =0.15*purchase_price;
	 purchase_price =purchase_price - discount;
	 printf("The purchase price is %d ",purchase_price);	
	}
	else 
	{
		printf("The purchase price is %d ",purchase_price);
	}
    
	} 
	else 
	printf("Invalid Input");
}  


