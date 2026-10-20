public class Print_Odd_and_Even {
    public static void main(String[] args) {
        int a[]={10,21,25,22,3};
        int oddele=a[0];
        int evenele=a[0];
        for(int i=0;i<a.length;i++)
        {
            if(a[i]%2!=0)
            {
                oddele=a[i];
                System.out.println("Odd element :"+oddele);
            }   
            else
                {
                    evenele=a[i];
                    System.out.println("Even Element"+evenele);
                } 
        }
        
    }
}
