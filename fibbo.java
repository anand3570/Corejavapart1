package corejavapart;

public class fibbo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0,b=1,c,i,count=10;
		System.out.println(a+"\n"+b);
		for(i=2;i<count;++i){
			c=a+b;
			System.out.println(""+c);
			a=b;
			b=c;
		}
	}

}
