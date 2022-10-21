import java.util.*;
class fact
{
	static int fact(int n)
	{
		int factorial = 1;
		for(int i=2; i<=n; i++)
		factorial = factorial*i;
		return factorial;
	}
	public static void main(String args[])
	{
		int num;
		System.out.println("Enter the value of n: ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		System.out.println("Factorial of the number is: " +fact(num));
	}
}
