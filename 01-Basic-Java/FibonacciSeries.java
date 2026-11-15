import java.util.Scanner;

class FibonacciSeries
{	
	// Print the FibonacciSequence upto number  
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number of terms: ");
		int n= sc.nextInt();
		int first=0;
		int second=1;
		
		for(int i=1; i<=n; i++)
		{
		System.out.print(first+ " ");
		int next= first+ second;
		first = second;
		second =next;
		}
		sc.close();		
	}
}