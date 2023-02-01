import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		String strArray[];
		int scoreArray[];
		int bounsScore = 0;

		Scanner sc = new Scanner(System.in);

		strArray = new String[sc.nextInt()];
		scoreArray = new int[strArray.length];
		
		for (int i = 0; i < strArray.length; i++)
		{
			strArray[i] = sc.next();
		}

		sc.close();
		
		for (int i = 0; i < strArray.length; i++)
		{
			bounsScore = 0;
			for (int j = 0; j < strArray[i].length(); j++)
			{
				if (strArray[i].charAt(j) == 'O')
				{
					scoreArray[i] += 1 + bounsScore;
					bounsScore++;
				} 
				else
					bounsScore = 0;
			}
		}

		for (int i = 0; i < scoreArray.length; i++)
		{
			System.out.println(scoreArray[i]);
		}
		
	}
}