class NestedLoopDemo //Pattern Demo 
{
	public static void main(String arg[])
	{
		// In star form
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=i; j++)
			{System.out.print("*");}
			{System.out.println();}
		}
		// In Number form
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=i; j++)
			{System.out.print(""+j);}
			{System.out.println();}
		}
	}
}
