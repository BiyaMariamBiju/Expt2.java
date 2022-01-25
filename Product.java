
import java.util.*;
public class Product 
{
    public static void main(String args[])
    {
        int i,j,x1,y1,x2,y2,k,sum;
        System.out.println("The no of coloumn of frst shud be equal to no of rows of the scnd array");
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the no of rows of frst array");
        x1=obj.nextInt();
        System.out.println("Enter the no of coloumns of frst array");
        y1=obj.nextInt();
        int[][] n=new int[x1][y1];
        System.out.println("Enter the elements");
        for(i=0;i<x1;i++)
        {
            for(j=0;j<y1;j++)
            {
               n[i][j]=obj.nextInt();
            }
        }
        System.out.println("Enter the no of rows of scnd array");
        x2=obj.nextInt();
        System.out.println("Enter the no of coloumns of  scnd array");
        y2=obj.nextInt();
        int[][] m=new int[x2][y2];
        System.out.println("Enter the elements");
        for(i=0;i<x2;i++)
        {
            for(j=0;j<y2;j++)
            {
               m[i][j]=obj.nextInt();
            }
        }
        int[][] prod=new int[x1][y2];
        for(i=0;i<x1;i++)
        {
            for(j=0;j<y2;j++)
            {
                sum=0;
               for(k=0;k<x2;k++)
               {
                  sum=sum+n[i][k]*m[k][j];
               }
               prod[i][j]=sum;
            }
        }
        System.out.println("The Resultant Array is");
        for(i=0;i<x1;i++)
        {
            for(j=0;j<y2;j++)
            {
                System.out.print(prod[i][j]+"\t");
            }
            System.out.print("\n");
        }
    } 
}
