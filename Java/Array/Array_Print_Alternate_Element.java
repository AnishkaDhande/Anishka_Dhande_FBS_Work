public class Array_Print_Alternate_Element {
    public static void main(String[] args) {
        int a[]={10,20,30,40,50,60};
        System.out.println("Alternate elements of array are ");
        for(int i=0;i<a.length;i++)
        {
            if(i%2==0)
                System.out.println(a[i]);
            
        }
    }
}
