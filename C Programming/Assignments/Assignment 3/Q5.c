#include<stdio.h>
void main()
{
  int sum=0,no,rem;
  printf("Enter number\n");
  scanf("%d",&no);
  int temp =no;
  while(no>0)
  {
  	rem =no%10;
  	sum =sum+rem*rem*rem;
  	no=no/10;
  }
  if(temp==sum)
  printf("Number is Armstrong ");
  else
  printf("The number is not Armstrong");
}
