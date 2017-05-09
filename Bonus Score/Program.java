import java.util.Scanner;

public class Calculations {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);

		int points = Integer.parseInt(console.nextLine());
		double bonusPoints = 0;
		if(points <= 100) {
			bonusPoints = 5;
		} else if(points > 1000) {
			bonusPoints = points * 0.1;
		} else if(points > 100) {
			bonusPoints = points * 0.2;
		}

		if (points % 2 == 0) {
			bonusPoints += 1;
		} 
		if (points % 10 == 5) {
			bonusPoints += 2;
		}
		System.out.println(bonusPoints);
		System.out.println(bonusPoints + points);
		
	} 
}
