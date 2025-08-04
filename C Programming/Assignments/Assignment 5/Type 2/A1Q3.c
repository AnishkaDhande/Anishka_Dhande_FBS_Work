#include<stdio.h>
int digitSum();
int rev();
int no;
void main()

{
	printf("Enter Three Digit Number :\n");
	scanf("%d",&no);
	int p=digitSum();
	int q=rev();
	 printf("Sum of digits is %d\n",p);
	printf("Reverse Number is %d\n ",q);
}
   int digitSum()
	{
    
	int n1,n2,n3,n4,s,rev;
	
	if(no>=100 && no<=999)
	{
		n1 =no/100;
	    n2 =no%100;
	    n3 =n2/10;
	    n4 =n2%10;
	    s=n1+n3+n4;
	   
	    return s;
	}
	else 
	    return 0;
	 
	
}
int rev()
	{
    
	int n1,n2,n3,n4,s,rev;
	
	if(no>=100 && no<=999)
	{
		n1 =no/100;
	    n2 =no%100;
	    n3 =n2/10;
	    n4 =n2%10;
	    rev =100*n4+10*n3+n1;
	    return rev;
	 
	}
	else 
	      return 0;
	 
	
}
