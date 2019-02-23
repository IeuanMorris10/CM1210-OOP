import java.util.Scanner;

public class PrintStarRectangle {
	public static void main( String args[] ) {

		Scanner reader = new Scanner(System.in);

		System.out.println("Enter width: ");
		int w = reader.nextInt();
		System.out.println("Enter height: ");
		int h = reader.nextInt();
		reader.close();

		for (int i = 0 ; i < h ; i++) {
		    for (int j = 0 ; j < w ; j++) {
		        System.out.print ("*");
						System.out.print (" ");
		    }
		    //after printing 10 numbers, go to a new line
		    System.out.println ();
		}


	}
}
