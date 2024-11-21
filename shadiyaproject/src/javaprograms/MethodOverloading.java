package javaprograms;
 class Multiplication
 {
	 static int multiply(int a,int b)
	 {
		 return a*b;
	 }
	 static double multiply(double a,double b)
	 {
		 return a*b;
	 }
 }

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Multiplication.multiply(3,3));
		System.out.println(Multiplication.multiply(4.8,3.8));

	}

}
