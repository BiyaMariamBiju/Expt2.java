import java.util.*;
public class Largest 
{
    public static void main(String args[])
    {
        int i,x,sum=0,demo,j,y;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the no of rows of array");
        x=obj.nextInt();
        System.out.println("Enter the no of coloumns of array");
        y=obj.nextInt();
        int[][] n=new int[x][y];
        System.out.println("Enter the elements");
        for(i=0;i<x;i++)
        {
            for(j=0;j<y;j++)
            {
               n[i][j]=obj.nextInt();
            }
        }
        demo=n[0][0];
        for(i=0;i<x;i++)
        {
            for(j=0;j<y;j++)
            {
              if(n[i][j]>demo)
              {
                 demo=n[i][j];
              }
            }
        }
        System.out.println(" largest element is: "+demo);
    }
}
