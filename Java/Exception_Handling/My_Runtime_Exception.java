class Voter{
	int age;
	Voter(int age){
		this.age=age;
	}
	public String toString()
	{
		return "Age is "+this.age;
	}
}
class AgeException extends RuntimeException
{
	public String toString()
	{
		return "Your Age is not Eligible for Voting";
	}
}
public class My_Runtime_Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a=Integer.parseInt(args[0]);
			if(a<18)
			{
				throw new AgeException();
			}
			else {
			Voter v=new Voter(a);
			System.out.println(v);
			}
			
			
		}
		catch(AgeException ae) {
			System.out.println(ae);
		}
      catch(Exception e)
		{
    	  System.out.println("Something went Wrong");
		}
	}
}
