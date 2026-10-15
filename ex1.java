package Lab_1;
import java.util.Scanner;

public class Task_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int Sum = 0;
		System.out.print("Enter a number: ");
		int Value = input.nextInt();
		System.out.print("\nThe sequence of numbers from 1000 to your number: ");
		for(int k = 1000; Value <= k; k--) {
			Sum += k;
			System.out.print(k + " ");
		}
		double Average = (double)Sum/(1000 - Value + 1);
		System.out.printf("\nThe sum of this series is: %d", Sum);
		System.out.printf("\nThe average of this series is: %.2f", Average);
		input.close();
	}

}
