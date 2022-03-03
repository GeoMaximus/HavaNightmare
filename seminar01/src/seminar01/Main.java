package seminar01;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("Hello World!");
		
		int x = 5;
		int y = x;
		y = 7;
		System.out.println(x);
		
		Student s;
		s=null;
		s = new Student();
		
		s.name = "Maria";
		
		Student s2 = s.myClone();
		
		s2.name = "John";
		
		
		System.out.println(s.name);

		Student s3 = (Student)s.clone();
		
		
		
		//any class, interface in java is a reference type
		
	}
}
