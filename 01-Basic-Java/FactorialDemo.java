import java.util.Scanner;

class FactorialDemo
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a Number :");
		int n=sc.nextInt();
		double fact=1;
		for(int i=1;i<=n;i++)
		{
			fact= fact*i;
		}
		System.out.println("Factorial ="+fact);
		sc.close();
	}
}