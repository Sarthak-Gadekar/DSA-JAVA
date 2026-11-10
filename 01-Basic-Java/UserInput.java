import java.util.Scanner;
class UserInput
{
	public static void main(String arg[])
	{
		
		Scanner sc =new Scanner(System.in);
		
		System.out.print("Enter your Name:");
		String name= sc.nextLine();
		
		System.out.print("Enter your Age:");
		int age= sc.nextInt();
		
		System.out.print("Enter your marks:");
		double marks= sc.nextDouble();
		
		System.out.println("\n--- Student Details ---");
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		System.out.println("Marks:"+marks);
		
		sc.close();
	}
}