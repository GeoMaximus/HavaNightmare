package seminar01;

public class Student {
	public String name;
	public int age;
	
	public Student myClone() {
		Student copy = new Student();
		copy.name = name;
		copy.age = age;
		return copy;
	}

	@Override
	protected Object clone() {
		// TODO Auto-generated method stub
		Student copy = new Student();
		copy.name = name;
		copy.age = age;
		return copy;
	}
	
	
	
}
