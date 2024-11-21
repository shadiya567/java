package javaprograms;

import java.util.HashMap;

import java.util.Vector;

public class Collection1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[] {1,2,3,4};
		Vector<Integer> v=new Vector();
		HashMap<Integer,String> h=new HashMap<Integer, String>()
				;
		v.addElement(1);
		v.addElement(2);
		h.put(1,"geeks");
		h.put(2,"for");
		System.out.println(arr[0]);
		System.out.println(v.elementAt(0));
		System.out.println(h.get(1));

	}

}
