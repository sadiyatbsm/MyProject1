package Interface;

public interface I2 {

	int x=100;
	void show();
	
	public static void display()
	{
		System.out.println("Belongs to I2");
	}
	
	default void display1() {
		System.out.println("Default methiod from I2");
		
	}
}
