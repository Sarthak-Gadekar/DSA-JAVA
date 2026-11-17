import java.util.Scanner;

class PalindromeNumber
{ public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number :");
		int num =sc.nextInt();
		int original = num;
		int reverse=0;
		while(num>0){
			int digits= num%10;
			reverse= reverse*10+digits;
			num/=10;
		}
		if( original==reverse)
		{
		System.out.println(" Palindrome Number of each other: ");
		}else
		{
		System.out.println("Not a Palindrome Number of each other: ");
		sc.close(); 
		}
	}
}