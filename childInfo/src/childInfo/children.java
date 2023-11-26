package childInfo;
import java.util.Scanner;

public class children {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*  Storing the names and ages of children in a family:

	     	Need a string data type for storing the names of children,

	     	Need another string data type for storing the middle names of children,

	     	Need a char data type for storing children's gender,

	     	Need an integer (whole number) data type for ages of children.

		 */

		Scanner scnr = new Scanner(System.in);
		// storing the children's first names
		String firstName;	 

		// storing the children's middle names
		String middleName; 

		// storing the children's gender
		char genderChar; 
		
		String genderChild;

		// storing the ages, for me I think int, because it’s easier to remember for a number, instead of short (which is rarely used
		int childAge;
		
		System.out.println("Enter childs first name: ");
		firstName = scnr.nextLine();
		
		System.out.println("Enter child's middle name: ");
		middleName = scnr.next();
		
		System.out.println("Enter child's gender (M or F): ");
		genderChar = scnr.next().charAt(0);
		
		System.out.println("Enter child's age: ");
		childAge = scnr.nextInt();
		
		if (genderChar == 'M') {
			genderChild =  "male";
		}
		else {
			genderChild = "female";
		}
		
		System.out.println();
		System.out.println(firstName + " " + middleName + " is " + genderChild + " and " + childAge + " years old!");
		
		scnr.close();
		
		

	}

}



		