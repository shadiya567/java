package javaprograms;
class Person
{
	private int age;
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
}

public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Person p1=new Person();
      p1.setAge(22);
      System.out.println("my age is"+p1.getAge());
	}

}
