import java.util.Scanner;

public class IsSum8 
{
	public static void main(String[] args)
	{
		int n1,k,j;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the length of array : ");
		n1=in.nextInt();
		int [] arr1=new int[n1];
		System.out.println("Enter the elements for array : ");
		for(int i=0;i<n1;i++)
		{
			arr1[i]=in.nextInt();
		}
		System.out.println("Enter the required sum : ");
		int x=in.nextInt();
		for(int i=0;i<n1;i++)
		{
			
			for(j=i+1;j<n1;j++)
			{
					if((arr1[i]+arr1[j])==x)
					{
						System.out.println("The elements "+arr1[i]+" and "+arr1[j]+" would make sum "+x);
					}
				
					
			}
		}
		in.close();
	}
}
