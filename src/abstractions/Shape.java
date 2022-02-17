package abstractions;

public abstract class Shape {
	abstract void area(int x,int y);
	abstract void volume(int x, int y, int z);
	
	void show(String msg) {
		System.out.println(msg);
	}
}