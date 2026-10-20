import java.util.Arrays;
public class Array_Reverse {
    public static void main(String[] args) {
        int a[]={10,20,30,40,50};
         //      x
         //                   y
        int x=0;int y=a.length-1;
        while(x<y)
        {   
                int temp=a[x];//10
                a[x]=a[y];//50
                a[y]=temp;//10
                x++;
                y--;         
        }
        System.out.println(Arrays.toString(a));
    }
}
