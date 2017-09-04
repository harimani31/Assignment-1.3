import java.util.Scanner;

public class logicvalue {
	public static void main(String[] args) 
    {
       int aValue, bValue;          // delcaring two int variable aValue and bValue 
       boolean a, b;   // delcaring two boolean variable aValue and bValue
       Scanner scan = new Scanner(System.in);    //Declaring obj scan to class scanner        
       System.out.println("Enter the value for aValue");
       aValue = scan.nextInt();     // assigning value to the variable aValue
       System.out.println("Enter the value for bValue");
       bValue = scan.nextInt();      // assigning value to the variable bValue
       System.out.println("Enter the value for a");
       a = scan.nextBoolean();     // assigning value to the variable aValue
       System.out.println("Enter the value for b");
       b = scan.nextBoolean();      // assigning value to the variable bValue
       System.out.println("Bitwise And" + " " + (aValue & bValue));  //  Bitwise And operator
       System.out.println("Logical And" + " " + (a && b));   //Logical And operator
    }

}
