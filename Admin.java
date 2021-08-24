
package librarytest;

import java.util.Scanner;

public class Admin {
   
    Scanner in = new Scanner(System.in);
    int nom;
    public Arrays [] admin ;
    
     public  void list()
     {
      System.out.println("Choose from the list:");
      System.out.println("1. Add libraian\n"
            + "2. View libraian\n"
             +"3. Delete libraian\n"
            + "4. Main Minu\n");
    int s=in.nextInt();
    if(s==1)
    {
       Addlibraian();
       list();   
    }
    if (s==2)
    {
       VeiwLibraian ();
       list();  
    }
     if (s==3) 
     {
       DeletLibraian();
       list();
     }
     if (s==4) 
     {
       LibraryTest.list();
     }  
     
     }
public void Addlibraian()
{
     System.out.print("Enter Number of libraian\n");
     nom = in.nextInt();
      admin = new Arrays[nom];
       for (int i = 0; i < admin.length; i++) 
        {
            admin [i] = new  Arrays();
        }
       for (int i = 0; i < admin.length; i++) 
        {
            System.out.println("Enter libraian Name");
            admin[i].libraianName = in.next();
            System.out.println("Enter libraian id (Don'd equal 0)");
            admin[i].libraianID = in.nextInt();
            System.out.println("Enter Password");
            admin[i].libraianPssword = in.next();
            System.out.println("Add Successful\n");
        }
       System.out.println("\n\n");
}
    
public void VeiwLibraian()
{
     for (int i = 0; i < admin.length; i++) 
        {
            if(admin[i].libraianID != 0)
            {
            System.out.println("Libraian Name: "+admin[i].libraianName+ " , "+
                               "Libraian id: " +admin[i].libraianID+ " , "+
                               "Libraian Password: "+admin[i].libraianPssword);   
            }
        }
     System.out.println("\n\n");
}

public void DeletLibraian()
{
    System.out.println("Enter Libraian NAME :");
    String lib = in.next();
    for (int i = 0; i <admin.length ; i++) 
    {
        if (admin[i].libraianName.equals(lib)) 
        {
            admin[i].libraianID= 0;
            admin[i].libraianID= 0;
        }
    }
    System.out.println("\n\n");
}

}
