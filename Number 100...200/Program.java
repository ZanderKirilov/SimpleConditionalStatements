import java.util.Scanner;

public class Convertor {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		
		int integer= Integer.parseInt(console.nextLine());
		if (integer < 100) {
			System.out.println("Less than 100");
		} else if (integer >= 100 && integer <= 200) {
			System.out.println("Between 100 and 200");
		} else {
			System.out.println("Greater than 200");
		}
	} 
}
