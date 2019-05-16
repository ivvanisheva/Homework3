import java.util.Scanner;

public class Task2b_PrintSortedNumbers {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter how many numbers want to add: ");
		int numberCount = sc.nextInt();
		int[] numbers = new int[numberCount];

		System.out.println("Now write " + numberCount + " numbers with enter after everyone:");

		for (int i = 0; i < numberCount; i++) {
			numbers[i] = sc.nextInt();
		}

		for (int i = 0; i < numberCount - 1; i++) {
			for (int j = i + 1; j < numberCount; j++) {
				if (numbers[i] > numbers[j]) {
					int tmp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = tmp;

					i = -1;
					break;
				}
			}
		}
		for (int i = 0; i < numberCount; i++) {
			System.out.printf("%4d", numbers[i]);
		}

		System.out.println();
		
		sc.close();
	}

}
