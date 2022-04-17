package ClientSide;

import AdditionApp.*;
import Calculette.DivisionParZero;

import org.omg.CosNaming.*;
import org.omg.CosNaming.NamingContextPackage.*;
import org.omg.CORBA.*;
import java.io.*;
import java.util.*;
 
public class StartClient {
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      try {
	    ORB orb = ORB.init(args, null);
	    org.omg.CORBA.Object objRef =   orb.resolve_initial_references("NameService");
	    NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef);
	    Addition addobj = (Addition) AdditionHelper.narrow(ncRef.resolve_str("ABC"));
 
            Scanner c=new Scanner(System.in);
            System.out.println("Welcome to the addition system:");          		    
		    for(;;){
		      System.out.println("Enter a:");
		      String aa = c.nextLine();
		      System.out.println("Enter b:");
		      String bb = c.nextLine();
		      int a=Integer.parseInt(aa);
		      int b=Integer.parseInt(bb);
		      int r=addobj.add(a,b);
		      System.out.println("The result for addition is : "+r);
		      System.out.println("-----------------------------------");
            }
       }
       catch (Exception e) {
          System.out.println("Hello Client exception: " + e);
          e.printStackTrace();
       }
      	catch (DivisionParZero e1) {
      		System.out.println("Division by 0 exception: " + e1);
            e1.printStackTrace();
      	}
 
    }
 
}
