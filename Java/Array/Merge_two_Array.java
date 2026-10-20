import java.util.Arrays;

public class Merge_two_Array {
    public static void main(String[] args) {
        int a[]={10,20,30,40,50};
        int b[]={11,22,33,44,55,66,77,88};
        int c[]=new int[a.length+b.length];
        int x=0,y=0;
        while(x<a.length && y<b.length)
        {
            c[x]=a[x];
            c[a.length+y]=b[y];
            x++;
            y++;
        }
       while(x<a.length)
        {
            c[x]=a[x];
            x++;
        }
       while(y<b.length)
         {c[a.length+y]=b[y];
            y++;
         }
        System.out.println(Arrays.toString(c));
    }
}
