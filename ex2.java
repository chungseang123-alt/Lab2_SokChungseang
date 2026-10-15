package Lab_1;
import java.util.Scanner;

public class Task_2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double a, b, c, Delta, Root1, Root2;
		
		System.out.print("  ================================================\n"
						+"               Welcome to out program\n"
						+"   'Quardratic Equation Solver ax^2 + bx + c = 0'\n"
						+"  ================================================\n");
		System.out.print("\n\nInput a: ");
		a = input.nextDouble();
		System.out.print("\nInput b: ");
		b = input.nextDouble();
		System.out.print("\nInput c: ");
		c = input.nextDouble();
		if(a == 0) {
			Root1 = -c/b;
			System.out.printf("\n\n--------------------------------------------------\n"
							+"Root of this equation: %.1fx^2 + %.1fx + %.1f = 0 is:\n"
							+"	x = %.2f\n"
							+"--------------------------------------------------\n", a, b, c, Root1);
		}
		else {
			Delta = b*b - 4*a*c;
			Root1 = (-b - Math.sqrt(Delta)/2*a);
			Root2 = (-b + Math.sqrt(Delta)/2*a);
			if (Delta < 0) {
				System.out.print("An error has occur due to delta being in the negative.");
			}
			else {
				System.out.printf("\n\n--------------------------------------------------\n"
							+"Root of this equation: %.1fx^2 + %.1fx + %.1f = 0 is:\n"
							+"		x1 = %.2f\n"
							+"		x2 = %.2f\n"
							+"--------------------------------------------------\n", a, b, c, Root1, Root2);
			}
			
		}
		input.close();
	}

}

