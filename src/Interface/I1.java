package Interface;

public interface I1 {
	int x=100;
	void show(); 
	
  public static void staticdemo()
  {
	  System.out.println("Method from I1");
  }
  default void defdemo()
  {System.out.println("Default method from I1");
  }
  }

