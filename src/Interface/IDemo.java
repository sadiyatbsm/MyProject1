package Interface;

public class IDemo implements I1,I2 {

	
	public IDemo(){
		this.defdemo();
	}
	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Method overridding ");
	}
static void staticdemo() {
	I2.display();
}
}
