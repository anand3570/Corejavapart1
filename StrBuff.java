package corejavapart;

public class StrBuff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer a= new StringBuffer("anand");
		a.append("panmand");
		System.out.println(a);
		a.insert(1, "and");
		System.out.println("insert  : "+a);
		a.replace(2, 3, "xyz");
		System.out.println("replace  : "+a);
		a.reverse();
		System.out.println(a);
		System.out.println("reverse " +a.capacity());
	}

}
