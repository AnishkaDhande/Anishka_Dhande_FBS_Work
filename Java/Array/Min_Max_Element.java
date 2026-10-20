class Min_Max_Element{
    public static void main(String[] args) {
        int a[]={10,23,40,43,21};
        int min=a[0];
        int max=a[0];
        for(int i=0;i<a.length;i++)
        {
           if(a[i]<min)
            min=a[i];
           if(a[i]>max)
            max=a[i];
        }
        System.out.println("The Largest Element from array is "+max);
        System.out.println("The Smallest Element from Array is "+min);
    }
}
