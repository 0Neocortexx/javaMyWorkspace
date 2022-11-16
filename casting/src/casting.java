import java.util.Scanner;

public class casting {

	public static void main(String[] args) {
		// Double b;
		char b;
		Scanner sc = new Scanner(System.in);
		// System.out.println("DIGITA SAMERDA AI: ");
		// b = sc.nextDouble();
		b = sc.next().charAt(3);
		// if (b > 10) {
		// System.out.println("É MAIOR CARAI");
		// } else if (b < 0) {
		// System.out.println("MENOR QUE 0 CARAI");
		// } else {
		// System.out.println("QUE PORRA É ESSA?");
		// }
		// Sysout (ctrl + space) autocomplete

		System.out.println("Digitou: " + b);
		sc.close();
	}

}
