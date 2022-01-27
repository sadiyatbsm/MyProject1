package Abstractions;

public class AbsMain {
	public static void main(String[] args) {
		
	
	Circle c = new Circle();
	c.show("Circle:");
	c.area(5,5);
	c.volume(4,4,5);
	
	
	Sphere s = new Sphere();
	s.show("Sphere :");;
	s.area(5, 6);
	s.volume(3, 5, 8);

}}
