package Lab_1;
import java.util.Scanner;

public class Task_5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		System.out.print("Enter a number: ");
		num = input.nextInt();
		System.out.printf("\nAll prime number within the range of 2 to %d: ", num);
		for (int i = 2; i <= num; i++){
			int k = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					k++;
				}
			}
			if (k == 2) {
				System.out.print(i + " ");
			}
		}
		input.close();
	}

}
