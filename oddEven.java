import java.util.Scanner;

public class oddEven 
{
	public static void main(String[] args)
	{
		int number;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a number : ");
		try
		{
			number=in.nextInt();
		
		if(number%2==0)
			System.out.println(number+" is even ");
		else
			System.out.println(number+" is odd ");
			in.close();
		}
		
		catch(Exception e)
		{
			System.out.println("The input is invalid. Only numbers are accepted");
		}
	}
}
