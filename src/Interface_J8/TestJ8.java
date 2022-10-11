package Interface_J8;

public interface TestJ8 {

	default void square() {
		System.out.println("Default : It is access specifier only allowed in Java8 only and declare the body inside method , need to create object \n");
	}
	
	static void square1() {
		System.out.println("Static: It is non-access specifier only allowed in Java8 only declare body inside method don't need to create object directly call");
	}

	class TestInt implements TestJ8{
		public static void main(String[] args) {
			TestInt obj=new TestInt();
			
			//default method
		obj.square();
			
		//static method
			TestJ8.square1();
		}
	}
}