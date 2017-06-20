import java.util.Scanner;
public class CountIntegers 
{
    public static void main(String[] args) 
    {
     int n,count=0,r;
     Scanner in= new Scanner(System.in);
     System.out.println("Enter the number for which the count of digits is to be calculated : ");
     try{
     n=in.nextInt();
     int b=n;
     while(b!=0)
     {
        r=b%10;
        b=b/10;
        count++;
     }
     System.out.println("Number of digits in "+n+" is "+count);
     }
     catch (Exception e)
     {
         System.out.println("Invalid input.");
     }
    }
}
