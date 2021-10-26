import java.util.*;
class Employee
{
    String name,city;
    int yoj;
    public void getInfo(String name, String city, int yoj)
    {
        this.name = name;
        this.city = city;
        this.yoj = yoj;          
    }
    
    public void printInfo()
    {
        System.out.println(name  + "\t\t" + city + "\t\t" +yoj );  
    }

    public static void main()
    {
        String name[] = new String[3];
        String city[]= new String[3];
        int yoj[]= new int[3];
        for (int i = 0; i <3; i++)
        {  
            Scanner sc= new Scanner (System.in);
            System.out.println("Enter the name of Employee");
            name[i]=sc.nextLine();
            System.out.println("Enter Year of Joining");
            yoj[i]=sc.nextInt();
            System.out.println("Enter City");
            sc.nextLine();
            city[i]=sc.nextLine();
        }
        Employee em1 = new Employee(); 
        em1.getInfo(name[0],city[0], yoj[0]);
        Employee em2 = new Employee();
        em2.getInfo(name[1],city[1], yoj[1]);
        Employee em3 = new Employee(); 
        em3.getInfo(name[2],city[2], yoj[2]);
        
        System.out.println("Name\t\tAddress\t\tYear Of Joining");
        em1.printInfo();
        em2.printInfo();
        em3.printInfo();
    }
}
