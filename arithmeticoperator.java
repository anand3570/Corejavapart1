package corejavapart;

import java.util.Scanner;


public class arithmeticoperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println(" Enter value of a and b :");
		int a = s.nextInt();
		int b = s.nextInt();
		System.out.println("sum : "+(a+b));
		System.out.println("difference : "+(a-b));
		System.out.println("multiply : "+(a*b));
		System.out.println("division : "+(a/b));
		float per = s.nextFloat();
		System.out.println("percentage is :"+per);
		String name= s.nextLine();
		System.out.println("name is :"+name);
	}

}
