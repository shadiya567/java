package javaprograms;

import java.util.Scanner;

public class ArrayDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp=0,i=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array limit");
		int a=sc.nextInt();
		System.out.println("enter the values");
		int []arr=new int[a];
		for(i=0;i<=arr.length-1;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(i=0;i<=arr.length;i++)
		{
			for(int j=i+1;j<=arr.length-1;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println("the duplicate numbers are "+arr[i]);
				}
			}
		}

	}

}
