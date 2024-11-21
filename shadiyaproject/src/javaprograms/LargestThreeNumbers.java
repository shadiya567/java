package javaprograms;

import java.util.Scanner;

public class LargestThreeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter three numbers");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int n3=sc.nextInt();
		
		if(n1>n2&&n1>n3)
		{
			System.out.println("the greater number is"+n1);
		}
		else if(n2>n3)
		{
			System.out.println("the greater number is"+n2);
		}
		else
			System.out.println("the greater number is "+n3);
	}

}
