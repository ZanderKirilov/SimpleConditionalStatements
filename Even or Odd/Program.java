import java.util.Scanner;

public class Calculations {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		
		int num = Integer.parseInt(console.nextLine());
		boolean even = (num % 2 == 0);
		if(even = (num % 2 == 0)) {
		  System.out.println("even");
	    } else {
		  System.out.println("odd");
	  }
	}
}
