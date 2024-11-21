package javaprograms;

import java.util.Iterator;
import java.util.Stack;

public class stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Stack<String>Stack1=new Stack<String>();
     Stack1.add("welcome");
     Stack1.add("one");
     Stack1.add("two");
     Stack1.add("three");
     System.out.println("iterartor values are");
     System.out.println("Stack"+Stack1);
     Iterator value=Stack1.iterator();
     while (value.hasNext())
     System.out.println(value.next());
	}

}
