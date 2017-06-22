import java.util.Scanner;

public class Factorial
{
	public static void main(String[] args)
	{
		int num,fact=1;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a number to find its factorial");
		num=in.nextInt();
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		System.out.println("The factorial of "+num+" is "+fact);
		in.close();
	}
}
