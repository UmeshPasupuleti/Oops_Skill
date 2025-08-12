//Program to display sum of squares of numbers from 1 to n
package Oops_skill;
import java.util.*;
public class SumOfSquares {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int n,i,sum=0;
	n = sc.nextInt();
	for(i = 1;i <=n;i++) {
			sum = sum+(i * i);
		}
	System.out.println(sum);
	}
	}

