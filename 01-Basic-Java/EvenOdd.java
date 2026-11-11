import java.util.Scanner;
class EvenOdd
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number:");
		int num= sc.nextInt();
		if(num%2==0)
		{
			System.out.println("Number is Even");
		}
		else {
			System.out.println("Number is Odd");
		}
		sc.close();
	}
}