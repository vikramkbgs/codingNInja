
import java.util.*;
  
public class GFG1 {
    public static void main(String[] argv)
        throws Exception
    {
  
        try {
  
            // Get the string
            String s = "Geeksforgeeks has Scanner Class Methods";
  
            // create a new scanner
            // with the specified String Object
            Scanner scanner = new Scanner(s);
  
            // print the next line of the string
            System.out.println("Scanner: "
                               + scanner.nextLine());
  
            // close the scanner
            scanner.close();
  
            System.out.println("\nScanner Closed.\n");
  
            System.out.println("Trying to use scanner"
                               + " after closing.");
  
            // print the next line of the string
            System.out.println(scanner.nextLine());
        }
  
        catch (Exception e) {
            System.out.println("Exception thrown:\n" + e);
        }
    }
}