import java.util.*;
class fibonacci
{
    int fibo (int n)
    {
        if (n==1)
            return 0;
        else if (n==2)
            return 1;
        else 
            return (fibo(n-1)+fibo(n-2));
    }
    public static void main()
    {
        Scanner sc= new Scanner (System.in);
        System.out.println ("Enter the number of terms");
        int n=sc.nextInt();
        fibonacci ob= new fibonacci();
        for (int i=1;i<=n;i++)
        {
            System.out.print(ob.fibo(i)+",");
        }
    }
}
