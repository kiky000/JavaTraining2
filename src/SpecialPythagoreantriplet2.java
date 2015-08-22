import java.util.ArrayList;
import java.util.Scanner;

public class SpecialPythagoreantriplet2 {

	static int checktrig(double i, double n) {
		int i2 = (int) i;
		int n2 = (int) n;
		if ((n * n + 2 * i * i - 2 * n * i) / (2 * n - 2 * i) == (n2 * n2 + 2 * i2 * i2 - 2 * n2 * i2)
				/ (2 * n2 - 2 * i2)) {
			if ((n * n - 2 * n * i) / (2 * n - 2 * i) == (n2 * n2 - 2 * n2 * i2) / (2 * n2 - 2 * i2)) {

				return (int) ((int) n * i * (n * n + 2 * i * i - 2 * n * i) / (2 * n - 2 * i));
			} else {
				return -1;
			}
		} else {
			return -1;
		}
	}

	static int trig(int n) {
		int index = -1;
		int index2 = 0;
		double p = 0;
		for (int i = 1; i <= n / 2 + 1; i++) {
			if (index < checktrig((double) i, (double) n)) {
				index = index2;

			}
		}
		return index;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		int[] sample = new int[number];
		for (int j = 0; j < number; j++) {
			sample[j] = in.nextInt();
		}
		for (int j = 0; j < number; j++) {
			System.out.println(trig(sample[j]));
		}
	}
}
