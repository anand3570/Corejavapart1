package corejavapart;

public class Pallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num2=6894,rem2,rev2=0,num2copy=num2;
		while(num2>0) {
			rem2 = num2 % 10;
			rev2 = rev2 * 10 + rem2 ;
			num2 /= 10; 
		}
		System.out.println(rev2);
		if(num2copy==rev2)
			System.out.println("pallindrome");
		else
			System.out.println("not pallindrome");
	}

}
