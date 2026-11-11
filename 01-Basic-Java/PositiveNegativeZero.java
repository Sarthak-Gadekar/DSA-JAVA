import java.util.Scanner;

class PositiveNegativeZero
{
	public static void main(String arg[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a Number:");
		int num =sc.nextInt();
		
		if(num>0){
			System.out.println("Positive Number");
		}
		else if(num<0){
			System.out.println("Negative Number");
		}
		else {
			System.out.println("Number is Zero");
		}
		sc.close();
	}
}