import java.util.Scanner;

public class PasswordGuess {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		String random = console.nextLine();
		
		if (random.equals("s3cr3t!P@ssw0rd")) {
			System.out.println("Welcome");
		} else {
			System.out.println("Wrong password!");
		}
			
	
	} 
}

