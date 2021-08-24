
package librarytest;

import java.util.Scanner;
//import javax.swing.JFrame;
public class LibraryTest {
    
    static Admin o1 = new Admin();
    static Libraian o2= new Libraian();
    static Scanner in = new Scanner(System.in);
    public static void list()
    {
      System.out.println("Choose:");
      System.out.println("1.Admin\n"
                        + "2.Libraian\n"
                        +"3.Log out\n");
      int s = in.nextInt();
      if (s == 1) 
        {
           o1.list(); 
           list();
        }
        if (s == 2) 
        {
            o2.list();
            list();
        }
        if (s == 3) 
        {
     
        }
    }
    public static void main(String[] args) {
     // Sara Mohammed Alwadia
   /*  JFrame window = new JFrame("Library");
     *window.setSize(200, 200);
     *window.show();
     *window.getColorModel();
*/
       LibraryTest.list();
       
}
}