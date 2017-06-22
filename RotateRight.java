import java.util.Scanner;

public class ReverseDigits
{
	public static void main(String[] args) 
    {
     int n,r;
     Scanner in= new Scanner(System.in);
     System.out.println("Enter the number to be reversed : ");
     String rev=new String();
     try{
     n=in.nextInt();
     int b=n;
     while(b!=0)
     {
        r=b%10;
        b=b/10;
        rev=rev+r;
     }
     int revnum=Integer.parseInt(rev);
     System.out.println("The reversed number is "+revnum);
     in.close();
     }
     catch (Exception e)
     {
         System.out.println("Invalid input.");
     }
    }
}
