package corejavapart;

import java.util.Scanner;

public class AdditionOfdigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int num = sc.nextInt();
		int sum = 0;
		int rem ;
		int a=num;
		while (a >= 0) {
			rem = num % 10;
			sum = sum + rem;
			num = num / 10;
			a++;
		}
		System.out.println(sum);
}
}