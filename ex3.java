package Lab_1;
import java.util.Scanner;

public class Task_3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a, b, c, d, e, max, min;
		System.out.print("Enter 5 integers: \n");
		a = input.nextInt();
		b = input.nextInt();
		c = input.nextInt();
		d = input.nextInt();
		e = input.nextInt();
		max = Math.max(Math.max(Math.max(a, b), Math.max(c, d)), e);
		min = Math.min(Math.min(Math.min(a, b), Math.min(c, d)), e);
		System.out.printf("\nAmong the 5 integers (%d, %d, %d, %d and %d), min is %d and max is %d", a, b, c, d, e, min, max);
		input.close();
	}

}
