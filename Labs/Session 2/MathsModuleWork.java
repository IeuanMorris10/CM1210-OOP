import java.lang.*;

public class MathsModuleWork {
	public static void main( String args[] ){
		// get a double number
    double x = 15;
		double y = 0;
    // convert degrees to radians
    y = Math.toRadians(x);
    // print the trigonometric sine for the doubles
    System.out.println("The sine of " + x + " is: " + Math.sin(y));

//----------------------------------------------
		// get two double numbers
		double a = 63;
		double b = 2.5;
		// print out a to the power b
		System.out.println(a + " to the power of " + b + " is: " + Math.pow(a, b));

//----------------------------------------------
		// get a value to square root
		int i = 2498;
		//print out the value of the square root
		System.out.println("The Square root of " + i + " is: "  + Math.sqrt(i));

//----------------------------------------------
		// outputs a radom number between 0 and 1
		System.out.println("Random number: " + Math.random());

//----------------------------------------------
		// outputs pi
		System.out.println("Pi is equal to: " + Math.PI);
	}
}
