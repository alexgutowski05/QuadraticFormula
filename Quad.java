import java.util.Scanner;
public class Quad {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Hello! Please enter your \"a\" value");
		double a = scan.nextDouble();
		System.out.println("You entered an \"a\" value of " + a);
		System.out.println("Please enter your \"b\" value");
		double b = scan.nextDouble();
		System.out.println("You entered a \"b\" value of " + b);
		System.out.println("Please enter your \"c\" value");
		double c = scan.nextDouble();
		System.out.println("You entered a \"c\" value of " + c);
		double bxb = b * b;
		double fourac = 4 * a * c;
		double d = bxb - fourac;
		double twoa = 2 * a;
		double negb = -1 * b;
		if (d > 0) {
			double rootd = Math.sqrt(d);
			double plusone = rootd - b;
			double minusone = rootd + b;
			double solOneA = plusone / twoa;
			double solOneB = minusone / twoa;
			System.out.println("The answer to your calculation is x=" + solOneA + " or x=" + solOneB);
		} else if (d == 0) {
			double solTwo = negb / twoa;
			System.out.println("The answer to your calculation is x=" + solTwo);
		} else if (d < 0) {
			double absd = Math.abs(d);
			double sqrtabsd = Math.sqrt(absd);
			double plusonetwo = sqrtabsd - b;
			double minusonetwo = squrtabsd + b;
			double solThreeA = plusonetwo / twoa;
			double solThreeB = minusonetwo / twoa;
			System.out.println("The answer to your calculation is x=" + solThreeA + "i or x=" + solThreeB + "i");
		} else {
			System.out.println("Sorry, something went wrong. Please try again");
		}
	}
}
