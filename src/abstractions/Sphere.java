package abstractions;

public class Sphere extends Shape {

	@Override
	void area(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("Area ="+ x*y);
	}

	@Override
	void volume(int x, int y, int z) {
		// TODO Auto-generated method stub
		System.out.println("Volume = "+ x*y*z);
		
	}

}
