package Oops_skill;
import java.util.*;
public class alphabet {
public static void main(String args[]) {
	char c;
	Scanner sc = new Scanner(System.in);
	c = sc.next().charAt(0);
	if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
		System.out.println(c+" is an alphabet");
	}
	else {
		System.out.println(c+" is not an alphabet");
	}
}
}
