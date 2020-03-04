import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Geben sie ihrr Gewicht ein");
		double x = scanner.nextDouble();

		Scanner newScanner = new Scanner(System.in);
		System.out.println("Geben sie ihre Grösse in CM ein");
		double y = scanner.nextDouble();

		double groesse = y / 100;
		double groesseInMeter = groesse * groesse;
		double bmiRechner = x / groesseInMeter;

		System.out.println(bmiRechner);

		scanner.close();
		newScanner.close();
	}
}