public class Array_sum {
    public static void main(String[] args) {
        int a[]={10,2,1,4,3};
        int sum=0;
        for(int i=0;i<a.length;i++)
        {
           sum+=a[i];
        }
        System.out.println("The Sum of all elements in Array is "+sum);
    }
}
