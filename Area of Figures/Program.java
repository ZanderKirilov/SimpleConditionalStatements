import java.util.Scanner;

public class Convertor {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);

		String figure = (console.nextLine());
		double side = Double.parseDouble(console.nextLine());

		if (figure.equals("square")) {
			double size = side * side;
			System.out.println(size);
		} else if (figure.equals("rectangle")) {
			double side2 = Double.parseDouble(console.nextLine());
			double size = side * side2;
			System.out.println(size);
		} else if (figure.equals("circle")) {
			double size = (Math.PI * side * side);
			System.out.println(size);
		} else if (figure.equals("triangle")) {
			double side2 = Double.parseDouble(console.nextLine());
			double size = side * side2 / 2;
			System.out.println(size);
		}
	}
}
