import java.util.Scanner;

public class StringToInteger 
{
	public static void main(String[] args)
	{
		String s1;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a string ");
		s1=in.next();
		int number=Integer.parseInt(s1);
	    System.out.println("The number is "+number);
	    in.close();
	}
	
}
