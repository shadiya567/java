package javaprograms;

import java.util.Scanner;

public class ArrayAscendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp=0,i=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array limit");
		int a=sc.nextInt();
		System.out.println("enter the values");
		int []arr=new int[a];
		for(i=0;i<=arr.length-1;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(i=0;i<=arr.length-1;i++)
		{
			for(int j=i+1;j<=arr.length-1;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
					
			}
		}
		System.out.println("the acsending order of array is");
		for(i=0;i<=arr.length-1;i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("the smallest element is"+arr[0]);
		System.out.println("the largest element is"+arr[arr.length-1]);

	}

}
