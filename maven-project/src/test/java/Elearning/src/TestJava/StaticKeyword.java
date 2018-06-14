package TestJava;

public class StaticKeyword {
	//**whenever static member declared it belong to class, not to specific instance

	public static void main(String[] args) {
		
		StaticKeyword1 mark = new StaticKeyword1();
		StaticKeyword1 tom = new StaticKeyword1();
		
		System.out.println(StaticKeyword1.NoofStudents);
	}

}
