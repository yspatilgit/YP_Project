package TestJava;

public class StaticKeyword1 {
	
	String Name;
	int age;
	static int NoofStudents = 0;
	
	StaticKeyword1(){
		NoofStudents++;
		
	}
	
	public static int NoofStudents(){
		return NoofStudents;
	}
		public static void StaticMethod() {
			
		System.out.println("its static used by StaticKeyword class");
	}
	
	public void NonStatic() {
		System.out.println("its Non static used by StaticKeyword class");
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
	
}
