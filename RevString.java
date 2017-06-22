import java.util.Scanner;

public class RevString 
{
	public static void main(String[] args)
	{
		String s1;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a string to reverse");
		s1=in.next();
		String rev="";
		int i;
		for(i=s1.length()-1;i>=0;i--)
		{
			rev=rev+s1.charAt(i);
		}
		System.out.println(rev);
		in.close();
	}
}
