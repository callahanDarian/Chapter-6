package Loops;

public class Loopies {

	public static void main(String[] args) 
	{
		int i = 1;
		int x = 0;
		int q = 0;
		
		for (i = 0; i != 11; i++)
		{
			while (x != 10)
			{
				x++;
				System.out.println("x "+x);			
			}		
			System.out.println("i "+i);
		}
		do
		{
			q++;
			System.out.println("q "+q);
		} while (q != 10);	
	}

}
