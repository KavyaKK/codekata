import java.util.Scanner;

public class vowelConsonant
{
	public static void main(String[] args)
	{
		char alpha1;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a character : ");
		alpha1=in.next().charAt(0);
		
		if(Character.isAlphabetic(alpha1))
		{
			char alpha=Character.toUpperCase(alpha1);
			if(alpha=='A'||alpha=='E'||alpha=='I'||alpha=='O'||alpha=='U')
			{
				System.out.println(alpha1+" is a vowel ");
			}
			else
			{
				System.out.println(alpha1+" is a consonant ");
			}
		}
		else
		{
			System.out.println("The input character is not an alphabet");
		}
		in.close();
		
		
	}
}
