package javaprograms;
	class one
	{
		public void geek()
		{
			System.out.println("geek");
		}
	}
	class two extends one
	{
		public void print_for()
		{
			System.out.println("for");
		}
	}
	public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		two g = new two();
		g.geek();
		g.print_for();
		
			
		

	}

}
