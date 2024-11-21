package javaprograms;
 class parent
 {
	 void print()
	 {
		 System.out.println("parent class");
	 }
 }
class child1 extends parent
{
	void print()
	{
		System.out.println("childclass1");
	}
}
class child2 extends parent
{
	void print()
	{
		System.out.println("childclass2");
	}
}
public class MethodOveriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parent a;
		a=new child1();
		a.print();
		a=new child2();
		a.print();

	}

}
