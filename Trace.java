import java.util.*;
public class Trace 
{
    public static void main(String args[])
    {
        int i,j,x1,y1,sum=0;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the no of rows of array");
        x1=obj.nextInt();
        System.out.println("Enter the no of coloumns of array");
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
        
        for(i=0;i<x1;i++)
        {
            for(j=0;j<y1;j++)
            {
                if(i==j)
                {
                    sum=sum+n[i][j];
                }
            }
            
        }
        System.out.println("The Trace of the Array is:"+sum);
    }

}
