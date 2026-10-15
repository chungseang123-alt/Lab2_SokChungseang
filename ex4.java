package Lab_1;
import java.util.Scanner;
import java.util.Arrays;

public class Task_4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String date;
		System.out.print("Input a date in the structure of yyyy-mm-dd:\n");
		date = input.nextLine();
		String[] SeperateYearMonthDate = date.split("-");
		int[] StringtoDigit = Arrays.stream(SeperateYearMonthDate).mapToInt(Integer::parseInt).toArray();
		if (SeperateYearMonthDate[0].length() == 4) {
			switch (StringtoDigit[1]) {
			case 2:
				if (StringtoDigit[0] % 4 == 0) {
					if (StringtoDigit[2] <= 29) {
						System.out.print("\nValid");
						break;
					}
				}
				else {
					if (StringtoDigit[2] <= 28) {
					System.out.print("\nValid");
					break;
					}
					else {
						System.out.print("\nInvalid");
						break;
					}
				}
			case 1, 3, 5, 7, 8, 10, 12:
				if (StringtoDigit[2] <= 31) {
					System.out.print("\nValid");
					break;
				}
				else {
					System.out.print("\nInvalid");
					break;
				}
			case 4, 6, 9, 11:
				if (StringtoDigit[2] <= 30) {
					System.out.print("\nValid");
					break;
				}
				else {
					System.out.print("\nInvalid");
					break;
				}
			}
		}
		else {
			System.out.print("\nInvalid Year");
		input.close();
		}
	}


}
