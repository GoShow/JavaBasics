import java.util.Scanner;

public class Pr6_FormattingNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		double b = input.nextDouble();
		double c = input.nextDouble();
		String hexA = Integer.toHexString(a).toUpperCase();
		String binA = Integer.toBinaryString(a);
		System.out.printf("|%1$-10s|%2$010d|%3$10.2f|%4$-10.3f|", hexA, Integer.parseInt(binA), b, c);
	}

}
