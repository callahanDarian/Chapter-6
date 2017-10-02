package Loops;

public class CountByThrees {

	public static void main(String[] args) 
	{
		for (int x = 3; x <= 300; x = x + 3)
		{
			System.out.print(" "+x);
			if (x % 30 == 0)
			{
				System.out.println("");
			}
		}
	}

}
