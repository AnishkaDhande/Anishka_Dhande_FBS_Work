
import java.util.ArrayList;
class Student {

	
		// TODO Auto-generated method stub
       int rollno;
       String Name;
       Student(int rollno,String Name)
       {
    	   this.rollno=rollno;
    	   this.Name=Name;
    	   
       }
       public  String toString(){
    	   return rollno +"-"+ Name;
       }
		
}
	
	class Student1
	{
		public static  void main(String args[])
		{
			Student arr[]=new Student[4];
			
			arr[0]=new Student(23,"sitija");
			arr[1] =new Student(56,"Rani");
			arr[2] =new Student(24,"Anuradha");
			arr[3] =new Student(43,"Kirti");
			
			ArrayList <Student> a1=new ArrayList<>();
			for(int i=0;i<arr.length;i++)
			{
				a1.add(arr[i]);
			}
			for(int i=0;i<a1.size();i++)
			{
			System.out.println(a1.get(i));
			}
		}
		
	}

	



