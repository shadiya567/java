package javaprograms;

import java.util.Scanner;

public class UpperToLowerViseversa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String s=sc.nextLine();
		for(int i=0;i<=s.length()-1;i++)
		{
			char ch=s.charAt(i);
		if(Character.isUpperCase(ch))
		{
		 System.out.println(Character.toLowerCase(ch));
		}
		else
			System.out.println(Character.toUpperCase(ch));
		}
			

	}

}
