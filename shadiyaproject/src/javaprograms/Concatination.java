package javaprograms;

import java.util.Scanner;

public class Concatination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the strings to be concatenated");
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		System.out.println(s1+s2);
		System.out.println(s1.toUpperCase());
		System.out.println(s2.toLowerCase());

	}

}
