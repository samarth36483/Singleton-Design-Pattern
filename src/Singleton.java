// step-1 make the default constructor as private so it can be accessed within the class only
public class Singleton {
	
	String value;
	
	private static Singleton instance;  // to make sure that only instance gets created when getInstance method is 
										// invoked.
	
	private Singleton(String value) {
		try {
			Thread.sleep(1000);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		this.value = value;
	}
	
	// step-2 create a method to call default constructor that we have created above
	public static Singleton getInstance(String value) {
		if(instance == null)
		instance = new Singleton(value);
		
		return instance;
	}

}
