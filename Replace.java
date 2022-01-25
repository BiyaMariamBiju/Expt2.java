import java.util.*;
public class Replace 
{
    public static void main(String args[])
    {
        int i,x,sum=0,p,q;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the size of array");
        x=obj.nextInt();
        int[] n=new int[x];
        System.out.println("Enter the elements");
        for(i=0;i<x;i++)
        {
            n[i]=obj.nextInt();
        }
        System.out.println("The array is:");
        for(i=0;i<x;i++)
        {
            System.out.println(n[i]);
        }
        System.out.println("Enter the element to be added");
        p=obj.nextInt();
        System.out.println("Enter the element to be added");
        q=obj.nextInt();
        n[q-1]=p;
        System.out.println("The Final array is:");
        for(i=0;i<x;i++)
        {
            System.out.println(n[i]);
        }
    }  
}
