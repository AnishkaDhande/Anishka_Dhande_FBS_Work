import java.util.Scanner;

public class Array_Search_element {
     
    public static void main(String[] args) {
        int a[]={10,32,12,61,8};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number to be Searched");
        int p=sc.nextInt();
        boolean b=false;
        for(int i=0;i<a.length;i++)
        {
           if(a[i]==p)
             {
                b=true; 
                break;
            }
        }  
        if(b==true)
            System.out.println("Element Found");
        else
            System.out.println("Element Not Found");
    }
}
