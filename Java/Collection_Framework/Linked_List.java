import java.util.LinkedList;
public class Linked_List {
	public static void main(String args[])
	{
		LinkedList a1=new LinkedList();
		a1.add(23);
		a1.add(54);
		a1.add(4);
		a1.add(8);
		a1.add(91);
		
		for (int i=0;i<a1.size();i++)
		{
			System.out.println(a1.get(i));
		}
		
	}

}
