public class LoopTest {
	public static void main( String args[] ) {

    int i = 0;



    Task 1
    while(i < 6)  {
        System.out.println(i);
        i ++;
    }


//------------------------------------------------


    Task 2
    while(i < 16)  {
        System.out.print(i);
        i ++;
        if (i < 16)
          System.out.print(", ");
        else
          System.out.println(" ");
    }


//------------------------------------------------


    Task 3
    while(i > 0)  {
        System.out.print(i);
        i --;
        if (i > 0)
          System.out.print(", ");
        else
          System.out.println(" ");
    }


//------------------------------------------------


    Task 4
    while(i < 46)  {
        System.out.print(i);
        i += 5;
        if (i < 46)
          System.out.print(", ");
        else
          System.out.println(" ");
    }

    
  }
}
