import java.util.*;
public class Smallest 
{
    public static void main(String args[])
    {
        int i,x,sum=0,demo;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the size of array");
        x=obj.nextInt();
        int[] n=new int[x];
        System.out.println("Enter the elements");
        for(i=0;i<x;i++)
        {
            n[i]=obj.nextInt();
        }
        demo=n[0];
        for(i=0;i<x;i++)
        {
            if(n[i]<demo)
            {
                demo=n[i];
            }
        }
        System.out.println("Smallest element is: "+demo); 
    }
}
