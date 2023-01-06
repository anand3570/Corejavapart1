package corejavapart;

import java.util.Scanner;

public class PositiveorNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter numbe");
		int num =sc.nextInt();
		 if(num>0) {
			 System.out.println("positive");
		 }
		 else if(num==0) {
			 System.out.println("0");
		 }
		 else if (num<0) {
			 System.out.println("negative");
		 } 
	}

}
