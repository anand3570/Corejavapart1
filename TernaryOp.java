package corejavapart;

public class TernaryOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age=25;
		String result= age>=18? "vote" : "not vote";
		System.out.println(result);
		int a= 100;
		int b= 105;
		int c=300;
		int  max= a>b? a:b;
		System.out.println(max);
		int res = (a>b)?(a>c? a:c):(b>c? b:c);
		System.out.println(res);
		int min = (a<b)?(a<c? a:c):(b<c? b:c);
		System.out.println(min);
	}

}
