public class ArrayTest {
	public static void main( String args[] ) {

    int i = 0;
    int count = 0;

    int [] nums = {3 ,5 ,7 ,9 ,10};

    while (i < nums.length){
      count = count + nums[i];
      i ++;
    }
		System.out.println("The total is: " + count);
  }
}
