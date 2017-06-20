import java.util.Scanner;

public class numberType
{

	public static void main(String[] args)
	{
		int number;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a number : ");
		try{
			number=in.nextInt();
		
		if(number>0)
			System.out.println(number+" is positive");
		else if(number<0)
			System.out.println(number+" is negative");
		else
			System.out.println(number+" is zero");
		in.close();
		}
		catch(Exception e)
		{
			System.out.println("The input is invalid. Only numbers are accepted");
		}
	}
}

