package javaprograms;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=123,r,sum=0,temp;
temp=n;
while(n>0)
{
	r=n%10;
	sum=(sum*10)+r;
	n=n/10;
}
if(temp==sum)
	System.out.println("palindrome");
else
	System.out.println("not palindrome");



	}

}
