import java.util.Scanner;

public class RewriteNumber {
	public static void main( String args[] ) {
	    Scanner in = new Scanner( System.in );

	    System.out.println( "Enter an integer between 0 and 9" );
	    int num = in.nextInt();

			switch(num) {
	       case 0 :
	          System.out.println("You enetred zero");
	          break;
					case 1 :
						System.out.println("You enetred one");
						break;
					case 2 :
						System.out.println("You enetred two");
						break;
					case 3 :
						System.out.println("You enetred three");
						break;
					case 4 :
						System.out.println("You enetred four");
						break;
					case 5 :
						System.out.println("You enetred five");
						break;
					case 6 :
						System.out.println("You enetred six");
						break;
					case 7 :
						System.out.println("You enetred seven");
						break;
					case 8 :
						System.out.println("You enetred eight");
						break;
					case 9 :
						System.out.println("You enetred nine");
						break;
	       default :
	          System.out.println("Please enter a number between 0 and 9");
				}

				/*
				if(num == 0)
					System.out.println("You entered zero");
				else if (num == 1)
					System.out.println("You entered one");
				else if (num == 2)
					System.out.println("You entered two");
				else if (num == 3)
					System.out.println("You entered three");
				else if (num == 4)
					System.out.println("You entered four");
				else if (num == 5)
					System.out.println("You entered five");
				else if (num == 6)
					System.out.println("You entered six");
				else if (num == 7)
					System.out.println("You entered seven");
				else if (num == 8)
					System.out.println("You entered eight");
				else
					System.out.println("You entered nine");
				*/
	}
}
