import java.util.Scanner;
import java.util.Random;

public class HowMany 
{

	public static void main(String[] args) 
	{
		Scanner cookie = new Scanner(System.in);
		Random rand = new Random();
		System.out.println("Please enter how many times you want the dice to be rolled: ");
		int rollNumber = cookie.nextInt();
	
		int one = 0;
		int two = 0;
		int three = 0;
		int four = 0;
		int five = 0;
		int six = 0;
		
		System.out.println("\nTHE ROLLS:");
		for (int number = 0; number < rollNumber ; number++)
		{
			int dice = rand.nextInt(6)+1;
			
			if (dice == 1)
			{
				one += 1;
			}
			if (dice == 2)
			{
				two += 1;
			}
			if (dice == 3)
			{
				three += 1;
			}
			if (dice == 4)
			{
				four += 1;
			}
			if (dice == 5)
			{
				five += 1;
			}
			if (dice == 6)
			{
				six += 1;
			}
			System.out.println(dice);
			
		}
		System.out.println("\nA TABLE FOR HOW MANY TIMES EACH NUMBER WAS ROLLED:");
		System.out.println("One:\t" + one);
		System.out.println("Two:\t" + two);
		System.out.println("Three:\t" + three);
		System.out.println("Four:\t" + four);
		System.out.println("Five:\t" + five);
		System.out.println("Six:\t" + six);
	}

}
