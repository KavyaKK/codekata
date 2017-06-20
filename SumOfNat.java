import java.util.Scanner;
public class SumOfNat 
{
     public static void main(String[] args) 
    {
     int n;
     Scanner in= new Scanner(System.in);
     System.out.println("Enter the number upto which the sum is to be calculated : ");
     try{
     n=in.nextInt();
     int sum=(n*(n+1))>>1;
     System.out.println("The sum of first "+n+" numbers is "+sum);
     in.close();
     }
     catch(Exception e)
     {
         System.out.println("Invalid input ");
     }
    }
}
