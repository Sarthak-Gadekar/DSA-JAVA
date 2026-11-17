import java.util.Scanner;

class ReverseNoDemo
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number :");
		int num=sc.nextInt();
		int rem=0;
		while (num>0)
		{
			int digit = num%10;
			rem= rem*10+digit;
			num/=10;
		}
		System.out.println("Reverse of given no:"+rem);
		sc.close();
	}
}