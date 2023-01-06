package corejavapart;
class Subject{
	int maths;
	int sci;
	void displayMarks() {
		System.out.println(" maths marks :-"+maths);
		System.out.println(" sci marks :-"+sci);
	}
}

public class localclass {
	
		public void displayAge() {
			int age=0;
			age+=10;
			System.out.println("age: "+age);
		}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		localclass localclass = new localclass();
		localclass.displayAge();
		Subject s = new Subject();
		s.maths=99;
		s.sci=15;
		s.displayMarks();
	}

}
