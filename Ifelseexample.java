package corejavapart;

import java.util.Scanner;

public class Ifelseexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter your marks :");
		int marks=sc.nextInt();
		
	 if(marks>0 && marks<50) {
			System.out.println("fail");
	}
		else if (marks>=50 && marks<=60) {
			System.out.println("d grade");
		}
		else if (marks>=60 && marks<=70) {
			System.out.println("C grade");
		}
		else if (marks>=70 && marks<=80) {
			System.out.println("B grade");
		}
		else if (marks>=80 && marks<=90) {
			System.out.println("A grade");
		}
		else if (marks>=90 && marks<=100) {
			System.out.println("A+ grade");
		}
		else {
			System.out.println("invalid output");
		}
}
}