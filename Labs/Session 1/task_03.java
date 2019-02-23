// While loop average
import java.util.Scanner;

public class task_03{
   public static void main(String[] args) {
     // initialise values for sum and average
     int sum = 0;
     int avg = 0;
     int i = 0;

     //Scanner to take user input
     Scanner in = new Scanner(System.in);

     //Initialise array a to store mark values
     int a[] = new int[5];

     //Do While loop adding user input values to array a and iterating the sum function
     do{
       System.out.print("Enter the " + (i + 1) + " number: ");
   	   a[i] = in.nextInt();
       sum += a[i];
       i++;
     }while(i < a.length);
     //Calculating average then outputting the total marks and average mark
     avg = sum / a.length;
     System.out.println("Total marks: " + sum);
     System.out.println("Average mark: " + avg);
   }
}
