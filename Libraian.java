
package librarytest;

import java.util.Scanner;

public class Libraian {


Scanner in = new Scanner(System.in);
int nom;
public Arrays [] libraian ;
Admin o = new Admin();
 public  void list()
 {
 /* int m = 0;
    System.out.println("Enter password:");
     String pass = in.next();
     for (int i = 0; i < libraian.length; i++) {
     }
       if (pass.equals(o.admin[i].libraianPssword)) 
       { 
           m = 1;
       }
       else System.out.println("Erorr Password");

       if(m==1)
    {*/
       System.out.println("Choose from the list:");
       System.out.println("1. Add Book\n"
            + "2. View Book\n"
             +"3. Search Book\n"
            + "4.Issue Book\n"
            + "5. Veiw Issue Book\n"
            + "6. ReturnBook\n"
            + "7. Main Minu\n");
    int s=in.nextInt();
    switch(s){
    case 1:
    {
       AddBook();
       list();   
    }
    case 2:
    {
       VeiwBook();
       list();  
    }
    case 3: 
     {
       SearchBook();
       list();
     }
    case 4 : 
     {
       IssueBook(); 
       list();
     }
    case 5: 
     {
       VeiwIssueBook(); 
       list();
     }
    case 6: 
     {
       ReturnBook();
       list();
     }
    case 8: 
     {
       LibraryTest.list();
     }
 }
    
     }
     
     
 
    
public  void AddBook()
{
    
     System.out.print("Enter Number of Book\n");
     nom = in.nextInt();
     libraian = new Arrays[nom];
        for (int i = 0; i < libraian.length; i++) 
        {
            libraian [i] = new  Arrays();
        }
        for (int i = 0; i < libraian.length; i++) 
        {
            System.out.println("Enter Book Name");
            libraian[i].BookName = in.next();
            System.out.println("Enter Book id (Don't equal 0)");
            libraian[i].BookID = in.nextInt();
            System.out.println("Add Successful\n");
        }
}

public void VeiwBook ()
{
        for(int i=0;i<libraian.length;i++)
        {
            if (libraian[i].BookID != 0) 
            {
             System.out.println(libraian[i].BookID+" , "+libraian[i].BookName);
            }
        }
        System.out.println("\n\n");
}

public void SearchBook()
{
    System.out.println("Issue Book");
    System.out.println("Enter Book name");
    String nam= in.next();
    int m=0;
    for(int i=0;i<libraian.length;i++)
       {
          if(nam.equals(libraian[i].BookName))
          {
           System.out.println(libraian[i].BookName+" , "+libraian[i].BookID);
           m=1;
          }
        }
          if(m==1)
           System.out.println("Avilable");
           else System.out.println("Not Found");
    System.out.println("\n\n");
}

public void IssueBook()
{
    System.out.println("Enter Book NAME :");
    String bok = in.next();
    for (int i = 0; i <libraian.length ; i++) 
    {
        if (libraian[i].BookName.equals(bok)) 
        {
            libraian[i].BookID = 0;
        }
    }
    System.out.println("\n\n");
}

public void VeiwIssueBook()
{
     for (int i = 0; i <libraian.length ; i++) 
    {
        if (libraian[i].BookID == 0)
        {
            System.out.println("Book is Out, "+ libraian[i].BookName);
        }
    }
     System.out.println("\n\n");
}

public void ReturnBook()
{
    for(int i=0;i<libraian.length;i++)
        {
            if (libraian[i].BookID == 0) 
            {
             System.out.println(libraian[i].BookID+" , "+libraian[i].BookName);
            }
        }
        System.out.println("\n\n");
}
}
