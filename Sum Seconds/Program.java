import java.util.Scanner;

public class Calculations {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);

		int time1 = Integer.parseInt(console.nextLine());
		int time2 = Integer.parseInt(console.nextLine());
		int time3 = Integer.parseInt(console.nextLine());
		int result = time1 + time2 + time3;
		int seconds = result % 60;
		int minutes = result / 60;
		
		System.out.printf("%d:%02d", minutes, seconds);
	} 
}
