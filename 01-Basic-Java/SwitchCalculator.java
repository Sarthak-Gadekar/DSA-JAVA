import java.util.Scanner;

class SwitchCalculator
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter First Number:");
		int a= sc.nextInt();
		
		System.out.print("Enter Second Number:");
		int b= sc.nextInt();
		
		System.out.println("--- Basic Operation of Calculator ---");
		System.out.println("1.Addition ");
		System.out.println("2.Substraction ");
		System.out.println("3.Multiplication ");
		System.out.println("4.Division");
		
		System.out.println("Enter Your Choice:");
		int choice = sc.nextInt();
		
		switch(choice)
		{
			case 1:
			System.out.println("Result:"+(a+b));
			break;
			case 2:
			System.out.println("Result:"+(a-b));
			break;
			case 3:
			System.out.println("Result:"+(a*b));
			break;
			case 4: if(b!=0){
				System.out.println("Result:"+(a/b));
			} else {
				System.out.println("Cannot divide by Zero");
			}
			break;
			default:
			System.out.println("Invalid Choice");
		}
		sc.close();
	}
}