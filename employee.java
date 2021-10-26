import java.util.*;
class Employee
{
    String name,address;
    int yoj;
    public void getInfo(String name, int yoj, String address)
    {
        this.name = name;
        this.yoj = yoj; 
        this.address = address;
    }
    
    public void printInfo()
    {
        System.out.println(name + "\t\t" +yoj +"\t\t\t" + address);  
    }

    public static void main()
    {
        String name[] = new String[3];
        int yoj[]= new int[3];
        String address[]= new String[3];
        for (int i = 0; i <3; i++)
        {  
            Scanner sc= new Scanner (System.in);
            System.out.println("Enter the name of Employee");
            name[i]=sc.nextLine();
            System.out.println("Enter Year of Joining");
            yoj[i]=sc.nextInt();
            System.out.println("Enter address");
            sc.nextLine();
            address[i]=sc.nextLine();
        }
        Employee em1 = new Employee(); 
        em1.getInfo(name[0],yoj[0], address[0]);
        Employee em2 = new Employee();
        em2.getInfo(name[1],yoj[1],address[1]);
        Employee em3 = new Employee(); 
        em3.getInfo(name[2],yoj[2], address[2]);
        
        System.out.println("Name"+"\t\t"+"Year Of Joining"+"\t\t"+"Address");
        em1.printInfo();
        em2.printInfo();
        em3.printInfo();
    }
}
