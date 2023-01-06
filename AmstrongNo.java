package corejavapart;

import java.util.Scanner;

public class AmstrongNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result=0,n=0,rem;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number ");
		int num=sc.nextInt();
		int number=num;
		while(number!=0) {
			rem=number%10;
			result+=Math.pow(rem, 3);
			number/=10;
		}
		if(result==num) {
			System.out.println(num+"is an armstrong no");
		}
		else
			System.out.println(num+"is not an armstrong no ");
	}

}
