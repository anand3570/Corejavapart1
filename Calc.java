package corejavapart;




	import java.util.Scanner;

	public class Calc {

		public static void main(String[] args) {
			float a, b, c;
			char op;
			Scanner s = new Scanner(System.in);
			System.out.println("1.add\n2.sub\n3.mult\n4.div\n5.exit");
		
			

			do {	System.out.println("enter an Operator :-");
				op = s.next().charAt(0);
				
				switch (op) {
				case '1': {
					System.out.println("enter two numbers");
					a = s.nextFloat();
					b = s.nextFloat();
					c = a + b;
					System.out.println("addition is "+c);
					break;

				}
				case '2': {
					System.out.println("enter two numbers");
					a = s.nextFloat();
					b = s.nextFloat();
					c = a - b;
					System.out.println("subtraction is "+c);
					break;

				}
				case '3': {
					System.out.println("enter two numbers");
					a = s.nextFloat();
					b = s.nextFloat();
					c = a * b;
					System.out.println("multipication is "+c);
					break;

				}
				case '4': {
					System.out.println("enter two numbers");
					a = s.nextFloat();
					b = s.nextFloat();
					c = a / b;
					System.out.println("division is "+c);
					break;

				}
				case '5':
					System.exit(0);

				default:
					System.out.println("error");
					break;

				}

			} while (op != 5);

		}
	
	}


