#include<stdio.h>
void rev();
void main()
{
rev();
}
void rev()
{
    int no;
	int n1,n2,n3,n4,s,rev;
	printf("Enter Three Digit Number :\n");
	scanf("%d",&no);
	if(no>=100 && no<=999)
	{
		n1 =no/100;
	    n2 =no%100;
	    n3 =n2/10;
	    n4 =n2%10;
	    s=n1+n3+n4;
	    printf("Sum of digits is %d\n",s);
	    rev =100*n4+10*n3+n1;
	    printf("Reverse Number is %d\n ",rev);
	}
	else 
	    printf("invalid input\nplease enter 3 Digit number");
	 
	
}
