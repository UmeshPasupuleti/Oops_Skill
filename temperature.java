//program to convert the temperature from fahrenheit to centigrade
package Oops_skill;
import java.util.Scanner;
public class temperature {
  public static void main(String args[]) {
    float f;
    float c;
    System.out.println("Enter the temperature in Fahrenheit: ");
    Scanner sc = new Scanner(System.in);
    f = sc.nextFloat();
    c = (f-32)*5/9;
    System.out.println("The given temperature in centigrade is : " +c );
  }
}