package javaprograms;
 abstract class Shape
 {
	 abstract void draw();
 }
 class Retangle extends Shape
 {
	 void draw()
	 {
		 System.out.println("drawing retangle");
	 }
 }
 class Circle1 extends Shape
 {
	 void draw()
	 {
		 System.out.println("drawing circle");
	 }
 }
public class Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s=new Circle1();
		s.draw();

	}

}
