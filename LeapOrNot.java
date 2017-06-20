import java.util.Scanner;
public class LeapOrNot 
{
	public static void main(String[] args)
	{
			int year;
			Scanner in=new Scanner(System.in);
			System.out.println("Enter any year : ");
			try
			{
			year=in.nextInt();
			if(year%100==0)
			{
				if(year%400==0)
				{
					System.out.println(year +" is a leap year");
				}
				else
				{
					System.out.println(year +" is not a leap year");
				}
			}
			else
			{
				if(year%4==0)
				{
					System.out.println(year +" is a leap year");
				}
				else
				{
					System.out.println(year +" is not a leap year");
				}
			}
			in.close();
			}
			catch(Exception e)
			{
				System.out.println("Invalid input");
			}
		}
			
	}
