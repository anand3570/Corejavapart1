package corejavapart;

import java.util.Scanner;

public class SwitchMarksheet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.println("enter a marks 1 to 100 :-");
		Scanner sc= new Scanner(System.in);
		System.out.println(" enter a grade ");
		String str=sc.next();
		char grade=str.charAt(0);
//		
//		int marks = sc.nextInt();
//		
//		switch(marks/10) {
//		case 10:
//			System.out.println(" A+ grade");
//			break;
//		case 9:
//			System.out.println(" A grade");
//			break;
//		case 8:
//			System.out.println(" B grade");
//			break;
//		case 7:
//			System.out.println(" C grade");
//			break;
//		case 6:
//			System.out.println(" D grade");
//			break;
//		case 5:
//			System.out.println(" Fail grade");
//			break;
//			default:
//				System.out.println(" invalid marks");
//				
//			
//			
//		}
		switch(grade) {
		case'A':
			System.out.println("Grade A- marks>=80");
			break;
		case'B':
			System.out.println("Grade B- marks>=70");
			break;
		case'c':
			System.out.println("Grade c- marks>=60");
			break;
		case'D':
			System.out.println("Grade D- marks>=50");
			break;
		case'F':
			System.out.println("Grade F- marks<50");
			break;
			default:
				System.out.println("invalid grade");
		}
	}

}
