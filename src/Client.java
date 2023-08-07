
public class Client {

	public static void main(String[] args) {
		Singleton instance1 = Singleton.getInstance("FOO");
		Singleton instance2 = Singleton.getInstance("bar");
		
		System.out.println(instance1.value);
		System.out.println(instance2.value);
		
		// The output will be FOO & FOO as the FOO value is assigned to object at first time and during the second time
		// same object is again called by the getInstance method

	}

}
