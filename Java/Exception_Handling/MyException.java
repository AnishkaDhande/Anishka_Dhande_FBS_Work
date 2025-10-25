
public class MyException
 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		    try {
			 int a=Integer.parseInt(args[0]);
			 int b=Integer.parseInt(args[1]);
		     int c=a/b;
			 System.out.println("Answer is "+c);
		     }
		    catch(ArithmeticException a){
		    	System.out.println("Abe second argument 0 mat bhej");	
		    }
		    catch(ArrayIndexOutOfBoundsException ai)
		    {
		    	System.out.println("Please provide two arguments");
		    }
		    catch(NumberFormatException n)
		    {
		    	System.out.println("Please provide Numbers only");
		    }
		    catch(Exception e)
		    {
		    	System.out.println("Something went Wrong we will fix it Soon");
		    }

	}

}
