package conditionalstatement;

import java.util.Scanner;

public class ColourName {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter colour code :");
		System.out.println(" R-Red \n B-Blue \n G-Green \n O-Orange \n Y-Yellow \n W-White");

		char choice=scan.next().charAt(0);



		switch(choice) {

		case 'R' : System.out.println("Red ");
		break;
		case 'B' :System.out.println("Blue ");
		break;
		case 'G': System.out.println("Green");
		break;
		case 'O' : System.out.println("Orange ");
		break;
		case 'Y' : System.out.println("Yellow");
		break;
		case 'W' : System.out.println("White ");			
		break;
		default :System.out.println("Enter valid code");

		}


	}

}
