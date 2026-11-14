import java.util.Scanner;

class SumOfNaturalNumbers
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int n= sc.nextInt();
		int sum=0;
		
		for(int i=0; i<=n; i++)
		{
			sum =sum+i;
		}
		System.out.println("Sum "+sum);
	}
}