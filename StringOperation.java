package corejavapart;

import java.util.Arrays;

public class StringOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="anand";
		String e="ANAND";
		String z ="   out    ";
		String b="is good boy";
		System.out.println(s+b);// concanating  two strings
		String c= s.concat(b);// concanating  two strings
		System.out.println(c);
		System.out.println(c.length());// checking length of string
		System.out.println("substring : "+c.substring(4, 7));// creating substring
		System.out.println("uppercase : " +c.toUpperCase());// creating upper case 
		System.out.println("lower : "+c.toLowerCase());// creating lower case
		String a="";
		System.out.println(" to check null :"+a.isBlank());// checking null string
		char[] d = new char[8];//crating array
		c.getChars(0, 7, d, 0);// pushing new element in array
		System.out.println("Get chars method :"+Arrays.toString(d));
		System.out.println("compare to string "+s.compareTo(e));// compare to string
		System.out.println("compare to string "+e.compareToIgnoreCase(s));
		System.out.println(" equals :"+s.equalsIgnoreCase(e));
		System.out.println("start with : "+s.startsWith("e"));
		System.out.println("end with :"+s.endsWith("d"));
		System.out.println("replace  :"+s.replace("anand", "pralhad"));
		System.out.println("Repeat :"+s.repeat(8));
		System.out.println(" trim method  : "+z.trim());
		System.out.println(" trim method leading :"+z.stripLeading());
		System.out.println(" trim method trailling"+z.stripTrailing());
	}

}
