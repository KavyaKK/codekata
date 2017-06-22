import java.util.Scanner;

public class RotateRight 
{
	public static void main(String[] args)
	{
		int n;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the length of array : ");
		n=in.nextInt();
		int [] arr=new int[n];
		int [] rot_arr=new int[n];
		System.out.println("Enter the elements : ");
		for(int i=0;i<n;i++)
		{
			arr[i]=in.nextInt();
		}
		System.out.println("Enter the number of right rotations : ");
		int k =in.nextInt();
		for(int i=0;i<n;i++)
		{
			rot_arr[i]=arr[(i+k-1)%n];
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(rot_arr[i]+" ");
		}
		in.close();
			
	}
}
