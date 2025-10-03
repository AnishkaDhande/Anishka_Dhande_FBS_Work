
package Firstbit.Assignments.Assignment_Function_Overloading;
import java.util.Scanner;

class  Perform
{
     void sum(int x1,int x2)
   {
	System.out.println("Addition is "+(x1+x2));
   }

      void sum(float f1,float f2)
   {
	System.out.println("Addition is "+(f1+f2));
   }
	
      void sum(int x1,float f2)
   {
	System.out.println("Addition is "+(x1+f2));
   }

       void sum(float f1,int x2)
   {
	System.out.println("Addition is "+(f1+x2));
   }
       
       
       void mul(int x1,int x2)
       {
    	System.out.println("Multion is "+(x1*x2));
       }

          void mul(float f1,float f2)
       {
    	System.out.println("Multion is "+(f1*f2));
       }
    	
          void mul(int x1,float f2)
       {
    	System.out.println("multion is "+(x1*f2));
       }

           void mul(float f1,int x2)
       {
    	System.out.println("Multion is "+(f1*x2));
       }
           
           void sub(int x1,int x2)
           {
        	System.out.println("Difference is "+(int)Math.abs(x1-x2));
           }

              void sub(float f1,float f2)
           {
        	System.out.println("Difference is "+(float)Math.abs(f1-f2));
           }
        	
              void sub(int x1,float f2)
           {
        	System.out.println("Difference is "+(float)Math.abs(x1-f2));
           }

               void sub(float f1,int x2)
           {
        	System.out.println("difference is "+(float)Math.abs(f1-x2));
           }

              
               void div(int x1,int x2)
               {
            	   if(x2!=0)
            	System.out.println("Quotient is "+(x1/x2));
            	   else
            		   System.out.println("Division by zero is Not Allowed");
               }

                  void div(float f1,float f2)
               {
                	  if(f2!=0)
            	System.out.println("Quotient is "+(f1/f2));
                	  else
                		  System.out.println("Division by zero is Not Allowed");
               }
            	
                  void div(int x1,float f2)
               { if(f2!=0)
            	System.out.println("Quotient is "+(x1/f2));
               else System.out.println("Division by zero is Not Allowed");
               }

                   void div(float f1,int x2)
               {
               if(x2!=0)
            	System.out.println("Quotient is "+(f1/x2));
                	   else
                		   System.out.println("Division by zero is Not Allowed");
               }

                  
       
}
 public class Calculator{
	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		 Perform c1=new  Perform();
		System.out.println("Enter Two Integer value ");/*Its optinonal System.out.println("Enter First Number ");*/
		int x1=sc.nextInt();                      	/*System.out.println("Enter Second Number ");*/
		int x2=sc.nextInt();
		
		System.out.println("Enter two Float value ");
		float f1=sc.nextFloat();                   
		float f2=sc.nextFloat();
		
		c1.sum(x1,x2);
		c1.sum(f1,f2);
		c1.sum(x1,f2);
		c1.sum(f1,x2);
		
		c1.mul(x1,x2);
		c1.mul(f1,f2);
		c1.mul(x1,f2);
		c1.mul(f1,x2);
		
		c1.sub(x1,x2);
		c1.sub(f1,f2);
		c1.sub(x1,f2);
		c1.sub(f1,x2);
		
		c1.div(x1,x2);
		c1.div(f1,f2);
		c1.div(x1,f2);
		c1.div(f1,x2);
		
		
		
	}
}
