package Exercizes;

import java.util.Scanner;

public class TestScoreStatistics {

	public static void main(String[] args)
	{
		int []score = new int[1000];
		
		int totalImput=0, currentInput = 0,lowest = 0,highest = 0;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter the score, or '999' to end :");
        score[totalImput]=keyboard.nextInt();
        
        totalImput++;
        
		do{
            System.out.print("Enter the score, or '999' to end :");
            score[totalImput]=keyboard.nextInt(); 
            
            if (score[totalImput] > score[(totalImput - 1)] && score[totalImput] != 999)
            {
            	highest = score[totalImput];
            }
            if (score[totalImput] < score[(totalImput - 1)])
            {
            	lowest = score[totalImput];
            }        
            totalImput++;
                        
        }while(score[(totalImput - 1)]!=999);
		
		while (currentInput != totalImput)
		{
			if (score[currentInput] < 0)
			{
				System.out.println("FAILURE - 0");
			}
			else if (score[currentInput] > 100)
			{
				System.out.println("SUCCESS - 100");
			}
			else
		System.out.println("The score is : " + score[currentInput]);
		currentInput++;
		}
		System.out.println("Highest : " + highest);
		System.out.println("Lowest : " + lowest);
	}
}