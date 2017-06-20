import java.util.Scanner;
public class LargeOf3 
{
	public static void main(String[] args)
	{
		int a,b,c;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter any 3 numbers");
		try
		{
		a=in.nextInt();
		b=in.nextInt();
		c=in.nextInt();
		int large;
		if(b>a&&b>c)
			large=b;
		else if(c>a&&c>b)
			large=c;
		else
			large=a;
		System.out.println(large +" is the largest of all given numbers.");
		in.close();
		}
		catch(Exception e)
		{
			System.out.println("Invalid input");
		}
	}
		
}
