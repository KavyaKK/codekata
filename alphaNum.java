import java.util.Scanner;

public class alphaNum
{
	public static void main(String[] args)
	{
		char alphanum;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a character : ");
		String input=in.next();
		alphanum=input.charAt(0);
		if (input.length()>1)
		{
			System.out.println("Enter a single character ");
		}
		else
		{
			if(Character.isAlphabetic(alphanum))
			{
				System.out.println(alphanum+" is a alphabet. ");
			}
			else 
			{
				System.out.println(alphanum+" is not a alphabet. ");
			}
		}
		in.close();
	}
}
