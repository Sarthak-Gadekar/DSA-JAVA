import java.util.Scanner;

class LargestOfTwo
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter First Number :");
		int a=sc.nextInt();
		
		System.out.print("Enter Second Number :");
		int b=sc.nextInt();
		
		if(a>b)
		{
			System.out.println(a +" is Largest Number");
		}
		else if(a<b){
			System.out.println(b +" is Largest Number");
		}
		else{
			System.out.println("Both Numbers are Equals");
		}
		sc.close();
	}
}