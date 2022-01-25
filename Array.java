import java.util.Scanner;

public class Array
{
    public static void main(String args[])
    {
        int i,x,sum=0;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the size of array");
        x=obj.nextInt();
        int[] n=new int[x];
        System.out.println("Enter the elements");
        for(i=0;i<x;i++)
        {
            n[i]=obj.nextInt();
            sum=sum+i;
        }
        System.out.println("Result="+sum);
    }
    
}
