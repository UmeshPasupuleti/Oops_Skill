//program to check whether given no is even or odd
package Oops_skill;
import java.util.*;

public class EvenOrOdd {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int x;
	System.out.print("enter a no:");
	x = sc.nextInt();
	if(x % 2 == 0) {
		System.out.println( x + "is a even no");
	}
	else {
		System.out.println( x + "is a odd no");
	}
}
}
