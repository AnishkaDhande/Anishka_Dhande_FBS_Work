
import java.util.LinkedList;
class Student2 {

	
		// TODO Auto-generated method stub
       int rollno;
       String Name;
       Student2(int rollno,String Name)
       {
    	   this.rollno=rollno;
    	   this.Name=Name;
    	   
       }
       public  String toString(){
    	   return rollno +"-"+ Name;
       }
		
}
	
	class Student_LinkedList
	{
		public static  void main(String args[])
		{
			Student2 arr[]=new Student2[4];
			
			arr[0]=new Student2(23,"sitija");
			arr[1] =new Student2(56,"Rani");
			arr[2] =new Student2(24,"Anuradha");
			arr[3] =new Student2(43,"Kirti");
			
			LinkedList <Student2> a1=new LinkedList<>();
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

	




