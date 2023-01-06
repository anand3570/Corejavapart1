package corejavapart;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=1,fact=1;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number to which fact is find :");
		int number=sc.nextInt();
		for(k=1;k<=number;k++) {
			fact=fact*k;
		}
		System.out.println("factorial of number"+fact);
	}

}
