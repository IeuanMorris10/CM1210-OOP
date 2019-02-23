public class FloatingPointTest{
	public static void main( String args[] ){
		float i = 1.36f;
		double n = 1.36;

		float x = 0.1f;
		float m = x + 0.6f;

		float y = 1 / 49;
		double z = 1 / 49;


		System.out.println("Float: " + y * 49);
		System.out.println("Double: " + z * 49);

		/*
		Compares the values to see if they match
		if(i == n)
			System.out.println("i and n are the same");
		else
			System.out.println("i and n are not the same");
		*/
	}
}
