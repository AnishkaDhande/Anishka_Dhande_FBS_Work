import java.util.Scanner;
public class Array_Prime_Number {
    static boolean isPrime(int n)
    {
        boolean b=false;
       if(n==0 || n==1)
          b=true;
       else
       
        for(int i=2;i<=n/2;i++)
        {
           if(n%i==0)
            { b=true;
             break;
            }
        }
         return !b;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size of Array");
        int v=sc.nextInt();
        int a[]=new int[v];
        System.out.println("Enter "+v+" elements in Array");
        for(int i=0;i<a.length;i++)
        {
           a[i]=sc.nextInt();
        }
        System.out.println("Prime NUmber from Array are :");
         for(int i=0;i<a.length;i++)
         {
            if(isPrime(a[i])==true)
                System.out.println(a[i]);
         }
       //System.out.println(isPrime(14));
    }
}
