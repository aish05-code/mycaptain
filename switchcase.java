import java.util.*;
public class switchcase
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println ("To add the matrix value press 1");
        System.out.println ("To multiply the matrix value press 2");
        int ch= sc.nextInt();
        System.out.println ("Enter values of the matrix (3*3)");
        int a[][]=new int[3][3];
        for (int i=0;i<3;i++)
        {
            for (int j=0;j<3;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }

        System.out.println ("Enter values of the second matrix (3*3)");
        int b[][]=new int[3][3];
        for (int i=0;i<3;i++)
        {
            for (int j=0;j<3;j++)
            {
                b[i][j]=sc.nextInt();
            }
        }
        int arr[][]=new int[3][3];
        switch (ch)
        {
            case 1:
                for (int i=0;i<3;i++)
                {
                    for (int j=0;j<3;j++)
                    {
                        arr[i][j]=a[i][j]+b[i][j];
                        System.out.print (arr[i][j]+"\t");
                    }
                    System.out.println ();
                }
                break;
            case 2:
                for (int i=0;i<3;i++)
                {
                    for (int j=0;j<3;j++)
                    {
                        arr[i][j]=a[i][j]*b[i][j];
                        System.out.print (arr[i][j] + "\t");
                    }
                    System.out.println ();
                }
                break;
            default:
                System.out.println("Select a valid option");
        }
    }
}
