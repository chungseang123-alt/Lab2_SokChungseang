package Lab_1;
import java.util.Scanner;

public class Task_6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int Mathe, English, Physics, Programming, max, min;
		double total, average;
		System.out.print("Input your scores of 4 subjects (Math, English, Physics, and Programming) in order:\n");
		Mathe = input.nextInt();
		English = input.nextInt();
		Physics = input.nextInt();
		Programming = input.nextInt();
		max = Math.max(Math.max(Mathe, English), Math.max(Physics, Programming));
		min = Math.min(Math.min(Mathe, English), Math.min(Physics, Programming));
		total = Mathe + English + Physics + Programming;
		average = total/4;
		String maxScore = "";
        if (Mathe == max) {
        	maxScore += "Math ";
        }
        if (English == max) {
        	maxScore += "English ";
        }
        if (Physics == max) {
        	maxScore += "Physics ";
        }
        if (Programming == max) {
        	maxScore += "Programming ";
        }
        maxScore = maxScore.trim().replace(" ", " and ");
        String maxSuffix = maxScore.contains(" and ") ? " courses" : " course";
        String minScore = "";
        if (Mathe == min) {
        	minScore += "Math ";
        }
        if (English == min) {
        	minScore += "English ";
        }
        if (Physics == min) {
        	minScore += "Physics ";
        }
        if (Programming == min) {
        	minScore += "Programming ";
        }
        minScore = minScore.trim().replace(" ", " and ");
        String minSuffix = minScore.contains(" and ") ? " courses" : " course";
        System.out.printf("Max score is: %d (%s%s).\n", max, maxScore, maxSuffix);
        System.out.printf("Min score is: %d (%s%s).\n", min, minScore, minSuffix);
	System.out.printf("Average score of this student is: %.2f", average);
	input.close();
	}

}
