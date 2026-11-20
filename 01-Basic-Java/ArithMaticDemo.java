import java.lang.*;

class ArithMaticDemo
{
	void add( int a, int b)
	{
		System.out.println("Addition is: "+(a+b));
	}
	void sub( int x, int y)
	{
		System.out.println("Substraction is: "+(x-y));
	}
	void mul( int x, int y)
	{
		System.out.println("Multiplication is: "+(x*y));
	}
	void div( int a, int b)
	{
		System.out.println("Division is: "+(a/b));
	}
	public static void main(String arg[])
	{
		ArithMaticDemo d1 = new ArithMaticDemo();
		d1.add(3,4);
		d1.sub(5,4);
		d1.mul(4,4);
		d1.div(6,3);
	}
}