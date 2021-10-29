import java.util.*;
class Prime
{
    int num,count;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println ("Please insert a value:");
        num=sc.nextInt();
    }

    void check()
    {
        for (int i=1;i<=num;i++)
        {
            if (num%i==0)
            {
                count++;
            }
        }
        if (count==2)
        {
            System.out.println (num+"is a Prime Number");
        }
        else
        {
            System.out.println (num+" is not a Prime Number");
        }
    }

    public static void main()
    {
        Prime ob =new Prime();
        ob.input();
        ob.check();
    }
}
