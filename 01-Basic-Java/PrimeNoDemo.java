import java.util.Scanner;

class PrimeNoDemo
{ public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number to check whether it is Prime or Not:");
		int num =sc.nextInt();
		int flag=0;
		if(num<=1){
				System.out.println("Number is not prime"); 
		} else {
		for( int i=2; i<num; i++)
		{
			if( num%i==0)
			{
				System.out.println("Number is not prime");
			flag =1;
			break;
			}
		}
		if(flag==0)
		{ System.out.println("Number is Prime: "); }
		sc.close();
	}
	}
}