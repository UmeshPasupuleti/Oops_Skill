//Program to check whether a given character is a vowel or a consonant
package Oops_skill;
import java.util.*;
public class vowel {
public static void main(String args[]) {
	char c;
	Scanner sc = new Scanner(System.in);
	c = sc.next().charAt(0);
	if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
		System.out.println(c+" is  vowel");
	}
	else {
		System.out.println(c+" is not vowel");
	}
}
}
